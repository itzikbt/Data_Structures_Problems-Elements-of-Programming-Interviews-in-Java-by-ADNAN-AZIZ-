import myPackage.BinaryTreeNode;

public class p157q104 {
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

     BinaryTreeNode<Integer> ancestor = LCAWithParentPointer( n2, n3);
     System.out.println(ancestor.getData());
     ancestor = LCAWithParentPointer( n2, n6);
     System.out.println(ancestor.getData());
     ancestor = LCAWithParentPointer( n6, n5);
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

    public static <T> BinaryTreeNode<T> LCAWithParentPointer(BinaryTreeNode<T> n1, BinaryTreeNode<T> n2){
        if (n1 == n2)
         return n1;

        BinaryTreeNode<T> n1Ancestor = n1;
        int n1depth = 0;
        while(n1Ancestor.getParent() != null){
            n1Ancestor = n1Ancestor.getParent();
            n1depth++;
        }
        BinaryTreeNode<T> n2Ancestor = n2;
        int n2depth = 0;
        while(n2Ancestor.getParent() != null){
            n2Ancestor = n2Ancestor.getParent();
            n2depth++;
        }

        if (n1depth > n2depth){
            for (int i = 0; i < n1depth - n2depth; i++)
                n1 = n1.getParent();
        }
        if (n1depth < n2depth){
            for (int i = 0; i < n2depth - n1depth; i++)
                n2 = n2.getParent();
        }

        while(n1 != n2){
            n1 = n1.getParent();
            n2 = n2.getParent();
        }

        return n1;


    }
}
