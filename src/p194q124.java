public class p194q124 {
    public static void main(String[] args) {

        System.out.println(integerSquareRoot(10));
        System.out.println(integerSquareRoot(4));

    }

    public static int integerSquareRoot(int n){


        int highBound = n, lowBound = 1;

        while(!(lowBound*lowBound <= n && (lowBound+1)*(lowBound+1) > n)){
            int mid = lowBound + (highBound - lowBound)/2;

            if (mid * mid == n)
                return mid;

            if (mid * mid < n){
                lowBound = mid;
            }else {
                highBound = mid;
            }
        }
        return lowBound;
    }


}
