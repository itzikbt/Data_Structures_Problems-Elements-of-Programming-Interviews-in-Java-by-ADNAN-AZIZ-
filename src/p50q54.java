import java.util.*;
import java.util.Random;

public class p50q54 {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(127);
        System.out.printf("x as int is : %d %n x as binary: %s %n",x, Integer.toBinaryString(x));
        int y = closestIntWithSameWeight(x);
        System.out.printf("y as int is : %d %n y as binary: %s %n",y, Integer.toBinaryString(y));
    }

    // x is a nonnegative integer, we assume different then 0 or its bits are all 1;
    // we look to swap the rightmost two consecutive bits that differ.
    public static int closestIntWithSameWeight(int x){
        int swapped = 0;
        int y = x;
        for (int i = 0; i < Integer.SIZE-1 && swapped == 0 ; i++)
            swapped = bitSwap(y, i,i+1);
        return swapped;
    }



    public static int bitSwap(int word, int i, int j){
        int y = word;
        if (((word >> i)&1) != ((word>>j)&1)) {
            int bitMask = (1 << i) | (1 << j);
            y ^= bitMask;
            return y;
        }
        return 0;
    }
}
