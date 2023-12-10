import myPackage.ListNode;

public class p115q81 {
    public static void main(String[] args) {

    }

    public static ListNode<Integer> mergeTwoSortedLists(ListNode<Integer> L1,ListNode<Integer> L2){
        ListNode<Integer> dummyHead = new ListNode<Integer>(0);
        ListNode<Integer> current = dummyHead;
        ListNode<Integer> n1 = L1, n2 = L2;

        while(n1 != null && n2 != null){
            if (n1.data <= n2.data){
                current.next = n1;
                n1 = n1.next;
            }
            else {
                current.next = n2;
                n2 = n2.next;
            }
            current = current.next;
        }

        current.next = n1 != null ? n1 : n2;

        return dummyHead.next;
    }

}
