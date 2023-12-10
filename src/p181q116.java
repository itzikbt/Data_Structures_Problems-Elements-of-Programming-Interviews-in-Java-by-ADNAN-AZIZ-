import java.util.*;
import myPackage.ArrayEntry;

public class p181q116 {
    public static void main(String[] args) {

    }

    public static List<Integer> KLargestElementsInAMaxHeap(List<Integer> maxheap, int k){
        if (k <= 0 || maxheap.isEmpty())
            return Collections.emptyList();

        PriorityQueue<ArrayEntry> myHeap = new PriorityQueue<>(new Comparator<ArrayEntry>() {
            @Override
            public int compare(ArrayEntry o1, ArrayEntry o2) {
                return Integer.compare(o2.value, o1.value );
            }
        });

        myHeap.add(new ArrayEntry(maxheap.get(0), 0));
        List<Integer> result = new ArrayList<>();
        for (int i = 0 ; i < k && !myHeap.isEmpty(); i++){
            ArrayEntry candidate = myHeap.remove();
            result.add(candidate.value);

            int leftChildCandidate = candidate.arrayId*2 +1;
            if (leftChildCandidate < maxheap.size())
                myHeap.add(new ArrayEntry(maxheap.get(leftChildCandidate), leftChildCandidate));

            int rightChildCandidate = candidate.arrayId*2 +2;
            if ((rightChildCandidate < maxheap.size()))
                myHeap.add(new ArrayEntry(maxheap.get(rightChildCandidate), rightChildCandidate));
        }

        return result;
    }

}
