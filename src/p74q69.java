import java.util.Collections;
import java.util.List;

public class p74q69 {
    public static void main(String[] args) {

    }
    public static List<Object> permuteTheElementsOfAnArray(List<Object> arr, List<Integer> permutation){
        if (arr.size() != permutation.size()){
            return arr; /// not on the same size -> error
        }
        for (int i = 0; i < arr.size() ; i++) {
            int next = i;

            while (permutation.get(next) != -1){
                Collections.swap(arr, i, permutation.get(next));
                int temp = permutation.get(next);
                permutation.set(next, -1);
                next = temp;
            }
        }

        return arr;
    }

}
