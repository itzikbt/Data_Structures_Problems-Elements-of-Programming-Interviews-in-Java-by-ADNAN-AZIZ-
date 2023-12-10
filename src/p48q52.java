


public class p48q52 {
    public static void main(String[] args) {
    }

    public static void bitSwap(long word, int i, int j){
        if (((word >> i)&1) == ((word>>j)&1))
            return;
        long bitMask = (1L << i) | (1L << j);
        word ^= bitMask;
    }


    public static void bitSwap2BrutForce(long word, int i, int j){
        if( i == j)
            return;
        if (i>j){
            int temp = j;
            j = i;
            i = temp;
        }
        long setI = 1;
        setI <<= i;
        long setJ = 1;
        setJ <<= j;
        setI &= word;
        setJ &= word;
        if((setI == 0 && setJ == 0) || (setI != 0 && setJ != 0))
            return;
        setI ^= setJ;
        word ^= setI;
        if (setI != setJ)
            setI <<= j-i;
        else
            setI >>= j-i;
        word ^= setI;
    }


}
