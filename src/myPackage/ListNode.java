
package myPackage;

public class ListNode<T> {
    public T data;
    public ListNode<T> next;
    public boolean isHead; // for p225q1310

    public ListNode(){
        this(null);
    }

    public ListNode (T key) {
        this.data = key;
        this.next = null;
        this.isHead = true;
    }

    public ListNode (T key, ListNode<T> next) {
        this.data = key;
        this.next = next;
        next.isHead = false;
        this.isHead = true;
    }

    public boolean hasNext(){
        return this.next != null;
    }

    public static <T> int listLength(ListNode<T> L){ // assume list is not cyclic
        int count = 1;
        while(L.hasNext()){
            L = L.next;
            count++;
        }
        return count;
    }

    public static <T> ListNode<T> search(ListNode<T> node, T key) {
        while (node != null && node.data != key)
            node = node.next;
        return node;
    }

    public static <T> void insertAfter(ListNode<T> node, ListNode<T> newNode) {
        newNode.next = node.next;
        node.next = newNode;
        newNode.isHead = false;
    }

    public static <T> void deleteNodeAfter(ListNode<T> node) {
        if (node.next != null)
            node.next = node.next.next;
    }

    public static <T> void insertTail(ListNode<T> node, ListNode<T> newTail) {
        while (node.next != null)
            node = node.next;
        node.next = newTail;
        newTail.isHead = false;
    }

}
