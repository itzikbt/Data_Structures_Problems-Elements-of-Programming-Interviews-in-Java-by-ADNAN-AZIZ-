import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p102q77 {
    public static void main(String[] args) {
        List<String> result = mnemonicsForAPhoneNumber("341");
        for (int i = 0 ; i < result.size(); i++)
            System.out.printf("%s \n",result.get(i));
    }



    private static final String[] Mapping = {"0", "1", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};

    public static List<String> mnemonicsForAPhoneNumber(String phoneNum) {
        List<String> result = new ArrayList<String>();
        char[] mnemonicArr = new char[phoneNum.length()];
        mnemonics(phoneNum, mnemonicArr, 0, result);
        return result;
    }

    public static void mnemonics(String phoneNum, char[] curMnemonic, int idx, List<String> result) {
        if (idx == phoneNum.length()){
            String curResult = new String(curMnemonic);
            result.add(curResult);
            return;
        }

        for (int i = 0; i < Mapping[phoneNum.charAt(idx) - '0'].length(); i++){
            curMnemonic[idx] = Mapping[phoneNum.charAt(idx) - '0'].charAt(i);
            mnemonics(phoneNum, curMnemonic, idx + 1, result);
        }
    }


}
