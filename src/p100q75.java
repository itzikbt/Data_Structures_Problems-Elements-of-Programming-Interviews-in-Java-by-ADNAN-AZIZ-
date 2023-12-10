public class p100q75 {
    public static void main(String[] args) {

        System.out.printf("%b ,",testPalindromicity("Ray a yar"));


    }

    public static boolean testPalindromicity(String str){
         for (int i = 0, j = str.length() -1; i < j ; i++, j--){

              while(!Character.isLetterOrDigit(str.charAt(i)) && i < j)
                   i++;
              while(!Character.isLetterOrDigit(str.charAt(j)) && i < j)
                   j--;

              int alphabetIdxRear = Character.isDigit(str.charAt(i)) ? str.charAt(i) - '0' : (str.charAt(i) >= 'a' &&
                      str.charAt(i) <= 'z' ? str.charAt(i) - 'a' : str.charAt(i) - 'A');
              int alphabetIdxFront = Character.isDigit(str.charAt(j)) ? str.charAt(j) - '0' : (str.charAt(j) >= 'a' &&
                      str.charAt(j) <= 'z' ? str.charAt(j) - 'a' : str.charAt(j) - 'A');

              if ((Character.isDigit(str.charAt(i)) && Character.isLetter(str.charAt(j))) || (Character.isLetter(str.charAt(i))
                      && Character.isDigit(str.charAt(j))) || (alphabetIdxFront != alphabetIdxRear))
                   return  false;
         }

         return true;
    }

}
