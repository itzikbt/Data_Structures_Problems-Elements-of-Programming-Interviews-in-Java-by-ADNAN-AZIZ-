import java.util.*;

public class p68q64 {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(3,4,1,0,2,0,1);
        boolean ifPossible = advancingThroughAnArray(arr);
        System.out.printf("%b",ifPossible);
    }

    public static boolean advancingThroughAnArray(List<Integer> arr){
        List<Integer> DArray = new ArrayList<>(Collections.nCopies(arr.size(),-1));
        recursiveCheck(arr,DArray,0);
        if (DArray.get(arr.size()-1) == -1)
            return false;
        return true;
    }

    public static void recursiveCheck(List<Integer> original, List<Integer> DArray, int index){
        if (DArray.get(index) != -1)
            return;
        DArray.set(index, 1);
        for (int i = 1; i <= original.get(index) && i + index < original.size(); i++){
            recursiveCheck(original,DArray,index + i);
        }
    }

}
