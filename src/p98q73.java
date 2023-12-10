public class p98q73 {
    public static void main(String[] args) {
        int converted = spreadsheetColumnEncoding("AA");
        System.out.println(converted);
    }


    public static int spreadsheetColumnEncoding(String numStr){

        int numAsInt = 0;
        for(int i = 0 ; i < numStr.length(); i++){
            numAsInt *= 26;
            numAsInt += numStr.charAt(i) -'A' + 1;
        }
        return numAsInt;
    }
}
