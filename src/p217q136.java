import java.util.*;

public class p217q136 {
    public static void main(String[] args) {

    }

    public static WordInfo wordWithSmallestDist = new WordInfo("",-1);

    public static String nearestRepeatedEntries(List<String> paragraph){
        Map<String, WordInfo> strMap = new HashMap<>();
        for (int i = 0; i < paragraph.size(); i++){
            String curStr = paragraph.get(i);
            if (!strMap.containsKey(curStr)){
                strMap.put(curStr,new WordInfo(curStr, i));
            }
            else {
                WordInfo curWord = strMap.get(curStr);
                curWord.updateInfo(i);
                if (curWord.smallestDist < wordWithSmallestDist.smallestDist)
                    wordWithSmallestDist = curWord;
            }
        }
        return wordWithSmallestDist.word;
    }



    public static class WordInfo{
        public String word;
        public int lastIdx;
        public int smallestDist;

        public WordInfo(String word, int idx){
            this.word = word;
            this.lastIdx = idx;
            this.smallestDist = Integer.MAX_VALUE;
        }

        public void updateInfo(int idx){
            if (smallestDist > idx - smallestDist)
                smallestDist = idx - smallestDist;
            lastIdx = idx;
        }
    }




}
