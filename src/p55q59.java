public class p55q59 {
    public static void main(String[] args) {
        System.out.printf("%b",isPalindrome(12121));

    }

    public static boolean isPalindrome(long num){
        if (num < 0)
            return false;
        final long numDigits = (long)(Math.floor(Math.log10(num)))+1;
        long msdMask = (long)Math.pow(10 ,numDigits -1);
        for(int i = 0; i < numDigits/2 ; i++){
            if (num/msdMask != num%10)
                return false;
            num %= msdMask;
            num /= 10;
            msdMask /= 100;
        }
        return true;
    }



}
