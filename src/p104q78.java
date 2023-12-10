
public class p104q78 {
    public static void main(String[] args) {
        System.out.printf("%s \n",theLookAndSayProblem(2));

    }

    public static String theLookAndSayProblem(int n){
        String result = nextInSequence("1", n);
        return result;
    }

    private static String nextInSequence(String cur, int k){
        if (k == 0){
            return cur;
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < cur.length(); i++){
            char curChar = cur.charAt(i);
            int countDig = 0;
            do{
                i++;
                countDig++;
            }
            while(i < cur.length() && cur.charAt(i) == curChar);
            i--;
            builder.append(countDig);
            builder.append(curChar);
        }
        return nextInSequence(builder.toString(), k-1);
    }

}
