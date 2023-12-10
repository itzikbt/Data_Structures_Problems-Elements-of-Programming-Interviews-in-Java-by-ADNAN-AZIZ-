import java.util.*;


public class p212q131 {
    public static void main(String[] args) {

    }

    public static boolean canFormPalindrome(String str){
        Map<Character, Integer> hashmap = new HashMap<>();
        for (int i = 0; i < str.length(); i++){
            char cur = str.charAt(i);
            if (!hashmap.containsKey(cur))
                hashmap.put(cur, 1);
            else
                hashmap.put(cur, hashmap.get(cur) +1);
        }

        int oddCharCount = 0;

        for (Map.Entry<Character,Integer> entry : hashmap.entrySet()){
            if (entry.getValue() % 2 == 1)
                oddCharCount++;
            if (oddCharCount >= 2)
                return false;
        }

        return true;
    }


}
