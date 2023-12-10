import myPackage.BinaryTreeNode;

public class p154q102 {
    public static void main(String[] args) {

    }

    public static <T> boolean isSymmetric(BinaryTreeNode<T> root){
        return root == null || recursiveSymmetricityCheck(root.getLeft(),root.getRight());

    }

    public static <T> boolean recursiveSymmetricityCheck(BinaryTreeNode<T> leftSide, BinaryTreeNode<T> rightSide){
        if ( leftSide.getData() != rightSide.getData() || (rightSide.getRight() != null && leftSide.getRight() == null) ||
                (rightSide.getRight() == null && leftSide.getRight() != null) || (rightSide.getLeft() != null && leftSide.getLeft() == null)
                || (rightSide.getLeft() == null && leftSide.getLeft() != null)) {
            return false;
        }

        if (leftSide.getLeft() != null) {
            boolean symmCheck1 = recursiveSymmetricityCheck(rightSide.getLeft(), leftSide.getLeft());
            if (!symmCheck1)
                return false;
        }
        if (leftSide.getRight() != null) {
            boolean symmCheck2 = recursiveSymmetricityCheck(rightSide.getRight(), leftSide.getRight());
            return symmCheck2;
        }

        return true;
    }

}
