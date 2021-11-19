import java.util.*;

public class mostCommonWord {
    public static void main(String[] args){
        System.out.println( solution("Bob hit a ball, the hit BALL flew far after it was hit.", new String[]{"hit"} ) );
    }

    public static String solution(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase();
        String[] words = paragraph.split("\\W+");

        HashSet<String> set = new HashSet<String>();
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        System.out.println(Arrays.toString(words));
        for( int i=0; i<banned.length; i++){
            set.add(banned[i]);
        }

        for(int i=0; i<words.length; i++){
            if(!set.contains(words[i])){
                if(map.get(words[i])==null){
                    map.put(words[i], 1);
                } else {
                    map.put(words[i], map.get(words[i])+1);
                }
            }
        }

        String commonWord = "";
        int max = 0;

        for (Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue()>max){
                max = entry.getValue();
                commonWord = entry.getKey();
            }
        }

        return commonWord;
    }    
}
