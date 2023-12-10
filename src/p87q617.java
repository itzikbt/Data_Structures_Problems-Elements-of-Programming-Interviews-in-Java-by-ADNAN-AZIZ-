import java.util.ArrayList;
import java.util.List;

public class p87q617 {
    public static void main(String[] args) {

    }

    public static List<Integer> computeSpiralOrdering(List<List<Integer>> arr){
        int bound = arr.size() - 1;
        int start = 0;
        List<Integer> result = new ArrayList<>();
        int i, j=0;
        while (bound >= 0){
            if (bound == 0) {
                result.add(arr.get(start).get(start));
                break;
            }
//          //right
            for (i = start; i < bound + start; i++)
                result.add(arr.get(i).get(j));
//          //down
            for ( j = start ;j < bound + start ; j++)
                result.add(arr.get(j).get(i));
            //left
            for (;i > start ; i-- )
                result.add(arr.get(i).get(j));
            //up
            for (;j > start ; j-- )
                result.add(arr.get(j).get(i));

            start++;
            bound -= 2;

        }
        return result;
    }

}
