import java.util.*;



public class p45q51 {
    public static void main(String[] args) {
        Random rand = new Random();
        long word = rand.nextInt(1000);
        short parity = parityOfWord(word);
        System.out.printf("number as int : %d \n num as binary : %s\n the parity is : %d", word,  Long.toBinaryString(word), parity);

    }

    public static short parityOfWord(long word){
        short parity = 0;
        while(word != 0){
            parity ^= 1;
            word &= word -1;
        }
        return parity;
    }
}
