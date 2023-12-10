

public class p54q58 {
    public static void main(String[] args) {

    }


    public static long reverseNumber(long x){
        long temp = Math.abs(x) , reversed = 0;
        while(temp != 0){
            reversed = (temp % 10) + (reversed * 10) ;
            temp /= 10;
        }
        long sign = x < 0 ? -1 : 1;
        return reversed * sign;
    }



}
