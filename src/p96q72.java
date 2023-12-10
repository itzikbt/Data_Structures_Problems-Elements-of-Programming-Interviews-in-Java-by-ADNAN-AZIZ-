import java.util.*;

public class p96q72 {
    public static void main(String[] args) {
        String converted = baseConversion("615", 7, 13);
        System.out.println(converted);

    }


    public static String baseConversion(String numStr, int b1, int b2){
        if (numStr.length() == 0)
            return "";
        boolean isNegative = numStr.charAt(0) == '-';
        int numAsInt = 0;
        for(int i = (isNegative ? 1 : 0); i < numStr.length(); i++){
            numAsInt *= b1;
            numAsInt += Character.isDigit(numStr.charAt(i)) ? numStr.charAt(i) - '0' : numStr.charAt(i) -'A' + 10;
        }
        return (isNegative ? "-" : "") + (numAsInt==0 ? "0" : convertIntToB2(numAsInt, b2));
    }


    public static String convertIntToB2(int num, int base){
        if (num == 0)
            return "";
        return (convertIntToB2(num/base, base)) + (char)(num % base >= 10 ? 'A' + num%base - 10 : '0' + num%base);
    }


}
