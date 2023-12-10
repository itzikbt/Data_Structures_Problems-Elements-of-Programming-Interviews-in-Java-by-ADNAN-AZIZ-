import java.util.Random;

public class p56q510 {
    public static void main(String[] args) {
        System.out.printf("%d",randomBetween(-20,45));

    }

    public static int randomBetween(int a, int b){ // assume a<b;
        int rangeLimit = b-a+1;
        int randNum;
        Random oneZeroRand = new Random();
        do {
            randNum = 0;
            for (int i = 0 ; (1 << i) < rangeLimit; i++)
                randNum  = (randNum << 1) | oneZeroRand.nextInt(2);
        }while(randNum >= rangeLimit);

        return randNum + a;
    }
}
