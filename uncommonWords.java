import java.util.*;

public class uncommonWords {
    public static void main(String[] args){
        System.out.println(Arrays.toString(solution("this apple is sweet", "this apple is sour")));
    }

    public static String[] solution(String s1, String s2) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        List<String> ans = new ArrayList<String>();
        String[] s1words = s1.split(" ");
        String[] s2words = s2.split(" ");

        for(int i = 0; i<s1words.length; i++){
            if(map.get(s1words[i])==null){
                map.put(s1words[i], 1);
            } else{
                map.put(s1words[i], map.get(s1words[i])+1);
            }
        }

        for(int i = 0; i<s2words.length; i++){
            if(map.get(s2words[i])==null){
                map.put(s2words[i], 1);
            } else{
                map.put(s2words[i], map.get(s2words[i])+1);
            }
        }

        for ( String key : map.keySet() ) {
            if(map.get(key)==1){
                ans.add(key);
            }
        }
        return ans.toArray(new String[ans.size()]);
    }
}
