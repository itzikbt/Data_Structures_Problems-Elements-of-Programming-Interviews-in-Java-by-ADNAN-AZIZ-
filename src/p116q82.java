import myPackage.ListNode;

public class p116q82 {
    public static void main(String[] args) {
        ListNode<Integer> first = new ListNode<>(0);
        for (int i = 1; i < 8; i++){
            ListNode<Integer> next = new ListNode<>(i, first);
            first = next;
        }
        ListNode<Integer> dummy = first;

        do {
            System.out.printf("%d ,", dummy.data);
            dummy = dummy.next;

        }while (dummy != null);

        System.out.printf("\n");
        first = ReverseASingleSublist(first, 3,5);
        dummy = first;
        do {
            System.out.printf("%d ,", dummy.data);
            dummy = dummy.next;

        }while (dummy != null);
    }

    public static ListNode<Integer> ReverseASingleSublist(ListNode<Integer> L, int start, int finish){

        if (finish <= start)
            return L;

        ListNode<Integer> dummyHead = new ListNode<>(0,L);
        ListNode<Integer> sublistHead =dummyHead;

        for (int i = 1;sublistHead != null && sublistHead.hasNext() && i < start; i++)
            sublistHead = sublistHead.next;

        ListNode<Integer> curr = sublistHead.next;

        for (int i = 0; i < finish -start; i++){
            ListNode<Integer> temp = curr.next.next;
            curr.next.next = sublistHead.next;
            sublistHead.next = curr.next;
            curr.next = temp;
        }

        return dummyHead.next;
    }


}
