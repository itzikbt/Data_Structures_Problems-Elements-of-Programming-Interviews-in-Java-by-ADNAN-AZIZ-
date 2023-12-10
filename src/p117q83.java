import myPackage.ListNode;

public class p117q83 {
    public static void main(String[] args) {

    }

    public static <T> ListNode<T> testForCyclicity(ListNode<T> L){

        boolean isCyclic = false;

        ListNode<T> fast = L.next;
        ListNode<T> slow = L;

        // two iterators, one fast and the other is slow, which will meet eventually if there is a cycle
        while (fast != null && slow != null ){
            if (fast == slow){
                isCyclic = true;
                break;
            }
            fast = fast.next.next;
            slow = slow.next;
        }

        if (!isCyclic)
            return null;

        int cycleSize = 0;
        do {
            cycleSize++;
            fast = fast.next;
        }while (fast != slow);

        // fast will be cycle length ahead
        fast = L;
        for (int i = 0; i < cycleSize; i++)
            fast = fast.next;

        // fast and slow will meet at the first node of the cycle
        slow = L;
        while (slow != fast){
            slow= slow.next;
            fast = fast.next;
        }

        return fast;



    }


}
