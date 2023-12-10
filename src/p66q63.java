import java.util.*;
import java.io.*;

public class p66q63 {
    public static void main(String[] args) {

    }

    public static List<Integer> multi2IntArrays(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        // check and save the sign; make them absolute
        int sign = arr1.get(0)*arr2.get(0) < 0 ? -1 : 1;
        arr1.set(0,Math.abs(arr1.get(0)));
        arr2.set(0,Math.abs(arr2.get(0)));
        // create a new arraylist with specific size and initialized to zero
        List<Integer> result = new ArrayList<>(Collections.nCopies(arr1.size() + arr2.size() , 0));
        // multiply the two arrays
        for (int i = arr1.size() -1 ; i >= 0; i--){
            for (int j = arr2.size() -1 ; j >= 0 ; j--){
                result.set(i + j + 1, result.get(i +j +1) + arr1.get(i) * arr2.get(j));
                result.set(i + j, result.get(i + j) + result.get(i + j + 1) / 10);
                result.set(i + j + 1, result.get(i + j +1) % 10);
            }
        }
        // check for leading zeros
        int zeroCounter = 0;
        for (int i = 0; i < result.size() && result.get(i) == 0; i++){
            zeroCounter++;
        }
        // delete the leading zeros
        result = result.subList(zeroCounter, result.size());
        // check if empty, if it is, it means the result is 0, return a new array containing 0
        if (result.isEmpty())
            return Arrays.asList(0);
        // return result with the right sign
        result.set(0, result.get(0) * sign);
        return result;
    }

}
