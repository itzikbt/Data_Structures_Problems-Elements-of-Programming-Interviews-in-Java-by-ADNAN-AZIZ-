import myPackage.BinaryTreeNode;

public class p152q101 {
    public static void main(String[] args) {

    }
    public static <T> boolean checkedBalance(BinaryTreeNode<T> root){
        int result = recursiveBalanceCheck(root, 0);
        return result < 0 ? false : true;
    }

    public static <T> int recursiveBalanceCheck(BinaryTreeNode<T> node, int depth){
        if( node == null)
            return depth-1;

        int leftHeight = recursiveBalanceCheck(node.getLeft(), depth +1);
        if (leftHeight < 0)
            return -1;
        int rightHeight = recursiveBalanceCheck(node.getRight(), depth +1);
        if (rightHeight < 0 || Math.abs(leftHeight - rightHeight) > 1)
            return -1;
        return Math.max(leftHeight, rightHeight);

    }


}
