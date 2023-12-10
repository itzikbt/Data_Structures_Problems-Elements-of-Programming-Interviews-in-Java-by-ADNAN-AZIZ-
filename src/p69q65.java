import java.util.List;

public class p69q65 {
    public static void main(String[] args) {

    }

    public static List<Integer> deleteDuplicatesFromSortedArray(List<Integer> arr){
        if (arr.size() <= 1)
            return arr;
        int dupNum =0, last = arr.get(0), nextPos = 1;
        for (int i = 1; i < arr.size(); i++){
            if(arr.get(i) == last){
                dupNum++;
                nextPos--;
            }
            else
                arr.set(nextPos, arr.get(i));
            last = arr.get(i);
            nextPos++;
        }

        return arr.subList(0,arr.size()-dupNum);
    }
}
