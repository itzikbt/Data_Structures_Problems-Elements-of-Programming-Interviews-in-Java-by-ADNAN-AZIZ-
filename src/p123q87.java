import myPackage.ListNode;

public class p123q87 {
    public static void main(String[] args) {

    }
    public static <T> ListNode<T> removeTheKthLastElementFromList(ListNode<T> L, int k){
        ListNode<T> dummyhead = new ListNode<T>(null, L);
        ListNode<T> forward = dummyhead;

        while(forward.hasNext() && k-- > 0)
             forward = forward.next;
        if (k > 0)
             return L;

        ListNode<T> iter = dummyhead;
        while(forward != null){
                forward = forward.next;
                iter= iter.next;
        }

        iter.next = iter.next.next;

        return dummyhead.next;

    }


}
