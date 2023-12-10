import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class p182q115 {
    public static void main(String[] args) {

    }

    public static void medianOfOnlineData(Iterator<Float> sequence){
        PriorityQueue<Float> minHeap = new PriorityQueue<>();
        PriorityQueue<Float> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        if (!sequence.hasNext())
            return;
        minHeap.add(sequence.next());
        System.out.println(minHeap.peek());

        while (sequence.hasNext()){
            float next = sequence.next();
            if (minHeap.size() > maxHeap.size()){
                if (minHeap.peek() < next){
                    minHeap.add(next);
                    maxHeap.add(minHeap.poll());
                }
                else{
                    maxHeap.add(next);
                }
                System.out.println((minHeap.peek() + maxHeap.peek()) / 2);
            }
            else if (maxHeap.size() > minHeap.size()){
                if (maxHeap.peek() > next){
                    minHeap.add(maxHeap.poll());
                    maxHeap.add(next);
                }
                else{
                    minHeap.add(next);
                }
                System.out.println((minHeap.peek() + maxHeap.peek()) / 2);
            }
            else {
                if (minHeap.peek() < next){
                    minHeap.add(next);
                    System.out.println(minHeap.peek());
                }
                else{
                    maxHeap.add(next);
                    System.out.println(maxHeap.peek());
                }
            }
        }
    }

}
