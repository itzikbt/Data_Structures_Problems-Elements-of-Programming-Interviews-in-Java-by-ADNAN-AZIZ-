import java.util.*;

public class p224q139 {
    public static void main(String[] args) {

    }


    public static int longestSubarrayWithDistinctEntries(List<Integer> arr){
        int result = 0, startIdx = 0;
        Map<Integer,Integer> mappedEntries = new HashMap<>();
        for (int i = 0; i < arr.size(); i++){
            Integer currIntLastIdx = mappedEntries.put(arr.get(i), i);
            if (currIntLastIdx != null){
                if (currIntLastIdx >= startIdx){
                    result = Math.max(result, i - startIdx);
                    startIdx = currIntLastIdx +1;
                }
            }
        }
        return Math.max(result, arr.size()-startIdx);
    }
}
