import myPackage.ListNode;

import static myPackage.ListNode.listLength;

public class p118q84 {
    public static void main(String[] args) {

    }

    public static <T> ListNode<T> testOverlappingTwoLists(ListNode<T> L1, ListNode<T> L2){

        int L1Length = listLength(L1);
        int L2Length = listLength(L2);

        if(L1Length > L2Length)
            L1 = moveForward(L1, L1Length - L2Length);
        else
            L2 = moveForward(L2, L2Length - L1Length);

        while (L1 != null && L2 != null && L2 != L1 ){
            L1 = L1.next;
            L2 = L2.next;
        }

        return L1;
    }

    public static <T> ListNode<T> moveForward(ListNode<T> L, int n){
        while (n-- > 0)
            L = L.next;
        return L;
    }

}
