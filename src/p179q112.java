import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class p179q112 {
    public static void main(String[] args) {

    }

    public static enum subArrayType {INCREASING, DECREASING};
    public static List<Integer> sortKIncreasingDecreasingArray(List<Integer> arr){
        List<List<Integer>> sortedSubArrays = new ArrayList<>();
        subArrayType type = subArrayType.INCREASING;
        int startIdx = 0;

        for (int i = 1; i <= arr.size(); i++){
            if (i == arr.size() || (arr.get(i-1) < arr.get(i) && type == subArrayType.DECREASING)
                    || (arr.get(i-1) > arr.get(i) && type == subArrayType.INCREASING)){
                List<Integer> subArray = arr.subList(startIdx,i);
                if (type == subArrayType.DECREASING){
                    Collections.reverse(subArray);
                }
                sortedSubArrays.add(subArray);
                startIdx = i;
                type = type == subArrayType.INCREASING ? subArrayType.DECREASING: subArrayType.INCREASING;
            }
        }

        return p177q111.mergeSortedFiles(sortedSubArrays);
    }


}
