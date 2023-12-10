import java.util.List;

public class p65q62 {
    public static void main(String[] args) {

    }

    public static List<Integer> plusOne(List<Integer> arr){
        int n = arr.size() - 1;
        arr.set(n, arr.get(n) + 1);
        for(int i = n; i > 0 && arr.get(i) >= 10 ; i--){
            arr.set(i,0);
            arr.set(i-1, arr.get(i-1));
        }
        if (arr.get(0)==10){
            arr.set(0,0);
            arr.add(0,1);
        }
        return arr;
    }

}
