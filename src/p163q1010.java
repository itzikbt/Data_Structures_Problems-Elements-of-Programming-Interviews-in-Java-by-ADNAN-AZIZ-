import myPackage.BinaryTreeNode;

public class p163q1010 {
    public static void main(String[] args) {

    }

    public static <T> BinaryTreeNode<T> inOrderSuccessor(BinaryTreeNode<T> node) {
        BinaryTreeNode<T> successor = node;

        if (successor.getRight() != null) {
            while (successor.getLeft() != null) {
                successor = successor.getLeft();
            }
             return successor;
        }

        while (successor.getParent() != null && successor.getParent().getRight() == successor){
            successor = successor.getParent();
        }
        return successor.getParent();
    }
}
