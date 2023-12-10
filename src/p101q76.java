public class p101q76 {
    public static void main(String[] args) {
        System.out.printf("%s",ReverseAllTheWordsInASentence("alice likes bob"));

    }

    public static String ReverseAllTheWordsInASentence(String sentence){
        StringBuilder reversed = new StringBuilder();
        for (int i = sentence.length()-1,  j = sentence.length(); i >= 0  ; i-- ){
            while ( i >= 0 && sentence.charAt(i) != ' ') {
                i--;
            }
            if (i == 0)
                reversed.append(sentence.substring(i , j ));
            else {
                reversed.append(sentence.substring(i + 1, j));
                reversed.append(" ");
            }
            j = i;
        }

        return reversed.toString();

    }


}
