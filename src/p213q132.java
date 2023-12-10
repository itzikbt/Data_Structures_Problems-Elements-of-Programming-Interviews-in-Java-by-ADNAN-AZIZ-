import java.util.*;

public class p213q132 {
    public static void main(String[] args) {

    }

    public static boolean isLetterConstructibleFromMagazine(String letter, String magazine){
     Map<Character, Integer> charCount = new HashMap<>();
     for (int i = 0; i < letter.length(); i++){
      char cur = letter.charAt(i);
      if (cur != ' ' && cur != '\n'){
       if (!charCount.containsKey(cur))
        charCount.put(cur,1);
       else
        charCount.put(cur,charCount.get(cur)+1);
      }
     }

     for (int i = 0; i < magazine.length() ; i++){
      char cur = magazine.charAt(i);
      if (charCount.containsKey(cur)){
       charCount.put(cur, charCount.get(cur) -1);
       if (charCount.get(cur) == 0)
        charCount.remove(cur);
       if(charCount.isEmpty())
        return true;
      }
     }
     return false;
    }


}
