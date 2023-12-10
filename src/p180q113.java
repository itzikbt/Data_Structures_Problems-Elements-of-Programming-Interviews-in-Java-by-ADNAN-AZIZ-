import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class p180q113 {
    public static void main(String[] args) {

    }

    public static void sortAnAlmostSortedArray(Iterator<Integer> sequence, int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k+1);
        for (int i = 0; i <= k && sequence.hasNext(); i++){
            minHeap.add(sequence.next());
        }

        while (!minHeap.isEmpty()){
            System.out.printf("%d, ", minHeap.poll());
            if (sequence.hasNext())
                minHeap.add(sequence.next());
        }
    }



}
