import java.util.*;

import myPackage.ArrayEntry;

public class p177q111 {
    public static void main(String[] args) {

    }

    public static List<Integer> mergeSortedFiles(List<List<Integer>> sortedArrays){
         List<Iterator<Integer>> iter = new ArrayList<>(sortedArrays.size());
         for (List<Integer> array : sortedArrays){
             iter.add(array.iterator());
         }

        PriorityQueue<ArrayEntry> minHeap = new PriorityQueue<>(((int) sortedArrays.size()), new Comparator<ArrayEntry>() {
            @Override
            public int compare(ArrayEntry o1, ArrayEntry o2) {
                return Integer.compare(o1.value,o2.value); }});

        for (int i = 0; i < iter.size(); i++){
            if (iter.get(i).hasNext())
                minHeap.add(new ArrayEntry(iter.get(i).next(), i));
        }

        List<Integer> result = new ArrayList<>();
        while(!minHeap.isEmpty()){
            ArrayEntry heapHead = minHeap.poll();
            result.add(heapHead.value);
            if (iter.get(heapHead.arrayId).hasNext())
                minHeap.add(new ArrayEntry(iter.get(heapHead.arrayId).next(), heapHead.arrayId));
        }
        return result;
    }


}
