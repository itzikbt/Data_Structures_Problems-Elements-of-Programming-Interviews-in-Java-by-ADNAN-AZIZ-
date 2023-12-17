import myPackage.ArrayEntry;
import myPackage.BSTNode;
import java.util.*;

public class p265q156 {
    public static void main(String[] args) {

    }

    public static List<Integer> closestEntriesInSortedArrays(List<List<Integer>> sortedArrays){
        List<Iterator<Integer>> heads = new ArrayList<>(sortedArrays.size());
        for (int i = 0; i < sortedArrays.size(); i++){
            heads.add(sortedArrays.get(i).iterator());
        }

        List<Integer> closestSoFar = new ArrayList<>(sortedArrays.size());
        int smallestDist = Integer.MAX_VALUE;

        NavigableSet<ArrayEntry> currentHeads = new TreeSet<>();
        for (int i = 0; i < heads.size(); i++){
            currentHeads.add(new ArrayEntry(heads.get(i).next(),i));
        }

        while(true){
            if (currentHeads.last().value - currentHeads.first().value < smallestDist){
                closestSoFar.clear();
                for (ArrayEntry entry: currentHeads){
                    closestSoFar.add(entry.value);
                }
                smallestDist = currentHeads.last().value - currentHeads.first().value;
            }

            int minIdx = currentHeads.first().arrayId;
            if (!heads.get(minIdx).hasNext())
                return closestSoFar;

            currentHeads.pollFirst();
            currentHeads.add(new ArrayEntry(heads.get(minIdx).next(),minIdx));

        }


    }



}
