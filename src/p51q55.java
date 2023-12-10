public class p51q55 {
    public static void main(String[] args) {

    }

    public static long multyWithoutArithmeticalOperators(long x, long y){
        long multy = 0;
        long tempX = x;
        long tempY = y;
        while(tempY != 0) {
            if((tempY & 1L) != 0){
                multy = add(multy, tempX);
            }
            tempX <<= 1;
            tempY >>>= 1;
        }
        return multy;
    }


    public static long add(long a, long b){
        long sum = 0, carryIn = 0, k = 1, tempA = a, tempB = b;
        while ((tempA != 0)  || (tempB != 0)){
            long ak = a & k, bk = b & k;
            long carryOut = (ak & bk) | (ak & carryIn) | (bk & carryIn);
            sum |= (ak ^ bk ^ carryIn);
            carryIn = carryOut << 1;
            k <<= 1;
            tempA >>>= 1;
            tempB >>>= 1;
        }
        return sum | carryIn;
    }




}
