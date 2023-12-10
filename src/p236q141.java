import java.util.*;

public class p236q141 {
    public static void main(String[] args) {

    }

    public static List<Integer> intersectTwoSortedArrays(List<Integer> A, List<Integer> B){
        List<Integer> intersection = new ArrayList<>();

        for (int i = 0, j = 0; i < A.size() && j < B.size();){
            if (A.get(i) == B.get(j)){
                int entry = A.get(i);
                intersection.add(entry);
                while(i < A.size() && A.get(i) == entry)
                    i++;
                while(j < B.size() && B.get(j) == entry)
                    j++;
            }
            else if (A.get(i) < B.get(j))
                i++;
            else       //A.get(i) > B.get(j)
                j++;
        }
        return intersection;

    }


}
