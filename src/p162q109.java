import myPackage.BinaryTreeNode;

public class p162q109 {
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

            BinaryTreeNode<Integer> ancestor = theKthNodeInorder(root, 5);
            System.out.println(ancestor.getData());
            ancestor = theKthNodeInorderSheli(root,5);
            System.out.println(ancestor.getData());
            ancestor = theKthNodeInorder(root, 3);
            System.out.println(ancestor.getData());
            ancestor = theKthNodeInorderSheli(root,3);
            System.out.println(ancestor.getData());
            ancestor = theKthNodeInorder(root, 1);
            System.out.println(ancestor.getData());
            ancestor = theKthNodeInorderSheli(root,1);
            System.out.println(ancestor.getData());

        //
//                                  root
//                                /      \
//                              n1        n2
//                             /         /   \
//                            n3        n4    n5
//                                     /
//                                    n6
    }

    public static <T> BinaryTreeNode<T> theKthNodeInorder(BinaryTreeNode<T> tree, int k){
        BinaryTreeNode<T> curNode = tree;
        while (curNode != null){
            int leftSize = curNode.getLeft() != null ? curNode.getLeft().getSize() : 0;
            if (leftSize >= k)
                curNode = curNode.getLeft();
            else if (leftSize + 1 == k)
                return curNode;
            else {
                curNode = curNode.getRight();
                k -= (leftSize + 1);
            }
        }
        return null;
    }


    public static <T> BinaryTreeNode<T> theKthNodeInorderSheli(BinaryTreeNode<T> tree, int k){
        if (k > tree.getSize() || k < 1)
            throw new IllegalArgumentException(k + " is out of tree size boundary: " + tree.getSize());

        BinaryTreeNode<T> result = null;
        if (tree.getLeft() != null ){
            if (tree.getLeft().getSize() >= k)
                result = theKthNodeInorderSheli(tree.getLeft(), k);
            else if (tree.getLeft().getSize() + 1 == k)
                result = tree;

            k -= tree.getLeft().getSize();
        }

        if (result != null)
            return result;

        if (k == 1)
            return tree;

        result = theKthNodeInorderSheli(tree.getRight(), k-1);

        return result;
    }


}
