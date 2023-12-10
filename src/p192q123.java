import java.util.List;

public class p192q123 {
    public static void main(String[] args) {

    }

    public static int SearchACyclicSortedArray(List<Integer> cycArr){
        int left = 0, right = cycArr.size() -1;

        while (left < right && cycArr.get(left) >= cycArr.get(right)){
            int mid = left + (right - left)/2;
            if (cycArr.get(mid) > cycArr.get(right)){
                left = mid +1;
            }
            else{
                right = mid;
            }

        }
        return left;
    }




}
