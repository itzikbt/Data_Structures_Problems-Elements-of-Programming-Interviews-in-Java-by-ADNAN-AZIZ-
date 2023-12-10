public class p95q71 {
    public static void main(String[] args) {
        System.out.printf("%s \n", intToString(326));
        System.out.printf("%d", stringToInt("0") );
    }

    public static String intToString(int num){
         boolean isNegative = false;
         if (num < 0)
              isNegative =true;

         if (num == 0)
             return "0";

         StringBuilder strnum = new StringBuilder();
         for (int i = 0; num != 0; i++ ){
              char next = (char)('0' + Math.abs(num % 10));
              strnum.insert(0,next);
              num /= 10;
         }

         if (isNegative)
             strnum.insert(0, "-");

         return strnum.toString();
    }

    public static int stringToInt(String strNum){
        boolean isNegative = false;
        if (strNum.charAt(0) == '-')
            isNegative = true;

        int num = 0;
        for (int i = (isNegative ? 1 : 0); i < strNum.length(); i++){
            num = num*10 + (strNum.charAt(i)- '0');
        }

        return isNegative ? -num : num;
    }

}
