import myPackage.BinaryTreeNode;

public class p155q103 {
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

        BinaryTreeNode<Integer> ancestor = LCA(root, n2, n3);
        System.out.println(ancestor.getData());
        ancestor = LCA(root, n2, n6);
        System.out.println(ancestor.getData());
        ancestor = LCA(root, n6, n5);
        System.out.println(ancestor.getData());


    }

 //
//                                  root
//                                /      \
//                              n1        n2
//                             /         /   \
//                            n3        n4    n5
//                                     /
//                                    n6

    public static<T> BinaryTreeNode<T> LCA(BinaryTreeNode<T> root, BinaryTreeNode<T> n1, BinaryTreeNode<T> n2){
        if (root == n1 || root == n2)
             return root == n1 ? n1 : n2;

        BinaryTreeNode<T> left = null;
        if (root.getLeft() != null) {
            left = LCA(root.getLeft(), n1,n2);
        }

        BinaryTreeNode<T> right = null;
        if (root.getRight() != null) {
            right = LCA(root.getRight(), n1,n2);
        }

        if (right != null && left != null)
            return root;

        return right != null ? right : left;
    }


}
