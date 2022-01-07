import java.util.*;
public class anagramsInString {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if(s.length()<p.length()){
            return list;
        }
        int [] map = new int[26];
        for(char c : p.toCharArray()){
            map[c-'a']++;
        }
        int left =0;
        int right = 0;
        int count = p.length();
        
        while(right <s.length()){
            if(map[s.charAt(right)-'a']>=1){
                count--;
            }
            map[s.charAt(right)-'a']--;
            right++;


            if(count == 0){
                list.add(left);
            }
            
            if(right - left == p.length()){
                if(map[s.charAt(left)-'a']>= 0){
                    count++;
                }
                map[s.charAt(left)-'a']++;
                left++;
            }



        }

        return list;

    }
}
