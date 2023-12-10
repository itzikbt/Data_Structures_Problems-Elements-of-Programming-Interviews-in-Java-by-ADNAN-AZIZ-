import myPackage.BinaryTreeNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class p161q108 {
    public static void main(String[] args) {

    }

    public static <T> List<T> preorderWithoutRecursion(BinaryTreeNode<T> tree){
        Deque<BinaryTreeNode<T>> nodes = new LinkedList<>();
        nodes.addFirst(tree);
        List<T> result = new LinkedList<>();

        while(!nodes.isEmpty()){
            BinaryTreeNode<T> curNode = nodes.removeFirst();
            if (curNode != null) {
                result.add(curNode.getData());
                nodes.addFirst(curNode.getRight());
                nodes.addFirst(curNode.getLeft());
            }
        }
        return result;
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
