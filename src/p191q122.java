import java.util.List;

public class p191q122 {
    public static void main(String[] args) {

    }

    public static int searchSortedArrayForEntryEqualToItsIndex(List<Integer> arr){
        int left = 0, right = arr.size()-1;

        while(left <= right) {
            int mid = left + (right - left) / 2;
            int difference = arr.get(mid)-mid;

            if (difference == 0)
                return mid;

            if (difference > 0){
                right = mid -1;
            }
            else
                left = mid +1;
        }
        return -1;
    }


}
