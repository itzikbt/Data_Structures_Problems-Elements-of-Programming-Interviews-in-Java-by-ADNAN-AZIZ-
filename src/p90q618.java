import com.sun.javafx.collections.ListListenerHelper;

import java.util.*;

public class p90q618 {
    public static void main(String[] args) {

    }

    public static void rotate2DArray(List<List<Integer>> arr){
        int offset = 0;
        for (int bound = arr.size()-1; bound > 0; bound -= 2){
            for (int i = offset; i < offset + bound; i++){
                int subArrSize = arr.size() - 2 * offset ;
                swapInArray(arr, i, offset, subArrSize + offset -1, i );
                swapInArray(arr,i, offset, subArrSize + offset - 1 - i,subArrSize + offset -1 );
                swapInArray(arr, i, offset, offset,subArrSize + offset - 1 - i );
            }
            offset++;
        }
    }

    public static void swapInArray(List<List<Integer>> arr, int col1, int row1, int col2, int row2){
        int temp = arr.get(col1).get(row1);
        arr.get(col1).set(row1,arr.get(col2).get(row2));
        arr.get(col2).set(row2, temp);
    }

}
