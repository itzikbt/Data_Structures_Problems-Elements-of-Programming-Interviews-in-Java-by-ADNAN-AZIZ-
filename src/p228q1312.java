import java.util.*;

public class p228q1312 {
    public static void main(String[] args) {

    }

    public static List<Integer> findAllSubstrings(String s, List<String> words){
        if (words.isEmpty())
            return Collections.emptyList();

        List<Integer> result = new ArrayList<>();
        int wordSize = words.get(0).length();

        for (int i = 0; i <= s.length()-(wordSize * words.size()); i++){
            if (isAConcatenation(s.substring(i ,i + wordSize * words.size()),words))
                result.add(i);
        }
        return  result;
    }

    public static boolean isAConcatenation(String subString, List<String> words ){
        Map<String, Integer> wordSet = new HashMap<>();
        for (String word : words) {
            if (!wordSet.containsKey(word))
                wordSet.put(word, 1);
            else
                wordSet.put(word,wordSet.get(word) + 1);
        }
        int lengthWord = words.get(0).length();
        for (int i = 0; i < subString.length(); i += lengthWord){
            String curWord = subString.substring(i, i + lengthWord);
            if (wordSet.containsKey(curWord)) {
                wordSet.put(curWord, wordSet.get(curWord) - 1);
                if (wordSet.get(curWord) <= 0)
                    wordSet.remove(curWord);
            }
            else return false;
        }
        return true;
    }



}
