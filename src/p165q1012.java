import myPackage.BinaryTreeNode;

import java.util.*;

public class p165q1012 {
    public static void main(String[] args) {
        List<Integer> inorder = Arrays.asList(6,2,1,5,8,3,4,9,7);
        List<Integer> preorder = Arrays.asList(8,2,6,5,1,3,4,7,9);

        BinaryTreeNode<Integer> tree = reconstructABinaryTree(inorder, preorder);

        inorderWithoutRecursion(tree);
        System.out.printf("\n");
        preorderWithoutRecursionPrint(tree);

    }

    public static BinaryTreeNode<Integer> reconstructABinaryTree(List<Integer> inorder, List<Integer> preorder){
        if (inorder.isEmpty() || preorder.isEmpty())
            return null;

        BinaryTreeNode<Integer> pivotNode = new BinaryTreeNode<>(preorder.get(0));

        if(inorder.indexOf(pivotNode.getData()) != 0)
            pivotNode.addLeft(reconstructABinaryTree(inorder.subList(0, inorder.indexOf(pivotNode.getData())),
                    preorder.subList(1, inorder.indexOf(pivotNode.getData()) +1)));

        if (inorder.indexOf(pivotNode.getData()) + 1 != inorder.size())
            pivotNode.addRight(reconstructABinaryTree(inorder.subList( inorder.indexOf(pivotNode.getData()) + 1, inorder.size()),
                    preorder.subList(inorder.indexOf(pivotNode.getData()) + 1, preorder.size())));

        return pivotNode;
    }

    public static void inorderWithoutRecursion(BinaryTreeNode<Integer> tree){
        Deque<BinaryTreeNode<Integer>> nodes = new LinkedList<>();
        BinaryTreeNode<Integer> curNode = tree;

        while (!nodes.isEmpty() || curNode != null) {
            if (curNode != null){
                nodes.addFirst(curNode);
                curNode = curNode.getLeft();
            }
            else{
                curNode = nodes.removeFirst();
                System.out.printf("%d, ", curNode.getData());
                curNode = curNode.getRight();
            }
        };

    }


    public static void preorderWithoutRecursionPrint(BinaryTreeNode<Integer> tree){
        Deque<BinaryTreeNode<Integer>> nodes = new LinkedList<>();
        nodes.addFirst(tree);

        while(!nodes.isEmpty()){
            BinaryTreeNode<Integer> curNode = nodes.removeFirst();
            if (curNode != null) {
                System.out.printf("%d, ", curNode.getData());
                nodes.addFirst(curNode.getRight());
                nodes.addFirst(curNode.getLeft());
            }
        }
    }

}


