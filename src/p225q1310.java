import myPackage.ListNode;
import java.util.*;

public class p225q1310 {
    public static void main(String[] args) {

    }

    public static int lengthOfAContainedInterval(List<Integer> intSet){
        if (intSet.isEmpty())
            return 0;

        Map<Integer, ListNode<Integer>> mappedEntries = new HashMap<>();

        for (int n : intSet){
            mappedEntries.put(n, new ListNode<>(n));
        }

        for (int n : intSet){
            if (mappedEntries.containsKey(n+1)){
                ListNode.insertAfter(mappedEntries.get(n), mappedEntries.get(n+1));
            }
        }

        int result = 1;
        for (Map.Entry<Integer, ListNode<Integer>> entry : mappedEntries.entrySet()){
            if (entry.getValue().isHead){
                int listLength = ListNode.listLength(entry.getValue());
                result = Math.max(result, listLength);
            }
        }

        return  result;
    }


}
