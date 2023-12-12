import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import myPackage.BinaryTreeNode;

public class p256q151 {
    public static void main(String[] args) {

    }

    public static boolean isSatisfiesBSTProperty(BinaryTreeNode<Integer> tree){
        Deque<BinaryTreeNode<Integer>> nodes = new LinkedList<>();
        int inOrder = Integer.MIN_VALUE;
        BinaryTreeNode<Integer> curNode = tree;

        while (!nodes.isEmpty() || curNode != null) {
            if (curNode != null) {
                nodes.addFirst(curNode);
                curNode = curNode.getLeft();
            } else {
                curNode = nodes.removeFirst();
                if (inOrder > curNode.getData())
                    return false;
                inOrder = curNode.getData();
                curNode = curNode.getRight();
            }
        }
        return true;
    }

}
