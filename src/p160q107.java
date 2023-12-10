import myPackage.BinaryTreeNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class p160q107 {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(0);
        BinaryTreeNode<Integer> n1 = new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> n2 = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> n3 = new BinaryTreeNode<>(3);
        BinaryTreeNode<Integer> n4 = new BinaryTreeNode<>(4);
        BinaryTreeNode<Integer> n5 = new BinaryTreeNode<>(5);
        BinaryTreeNode<Integer> n6 = new BinaryTreeNode<>(6);

        root.addLeft(n1);
        root.addRight(n2);
        n1.addLeft(n3);
        n2.addLeft(n4);
        n2.addRight(n5);
        n4.addLeft(n6);

        inorderWithoutRecursionPrint(root);

    }

    public static <T> List<T> inorderWithoutRecursion(BinaryTreeNode<T> tree) {
        Deque<BinaryTreeNode<T>> nodes = new LinkedList<>();
        List<T> inOrder = new LinkedList<>();
        BinaryTreeNode<T> curNode = tree;

        while (!nodes.isEmpty() || curNode != null) {
            if (curNode != null) {
                nodes.addFirst(curNode);
                curNode = curNode.getLeft();
            } else {
                curNode = nodes.removeFirst();
                inOrder.add(curNode.getData());
                curNode = curNode.getRight();
            }
        }
        ;

        return inOrder;
    }

    public static <Integer> void inorderWithoutRecursionPrint(BinaryTreeNode<Integer> tree) {
        Deque<BinaryTreeNode<Integer>> nodes = new LinkedList<>();
//        List<T> inOrder = new LinkedList<>();
        BinaryTreeNode<Integer> curNode = tree;

        while (!nodes.isEmpty() || curNode != null) {
            if (curNode != null) {
                nodes.addFirst(curNode);
                curNode = curNode.getLeft();
            } else {
                curNode = nodes.removeFirst();
                System.out.printf("%d, ", curNode.getData());
                curNode = curNode.getRight();
            }
        }
        ;
    }
}
