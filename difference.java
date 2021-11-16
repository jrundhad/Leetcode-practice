import java.util.*;

public class difference {
    public static void main(String[] args){
        System.out.println(solution("aa","aab"));
    }

    public static char solution(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        //insert string t characters to hash map and the count of each character
        for(int i=0; i<t.length();i++){
            if(map.get(t.charAt(i))==null){
                map.put(t.charAt(i), 1);
            } else {
                map.put(t.charAt(i), map.get(t.charAt(i)) + 1);
            }
        }
        //go thorugh characters of s and remove accordingly
        for(int i=0; i<s.length(); i++){
            if(map.get(s.charAt(i))==1){
                map.remove(s.charAt(i));
            } else{
                map.put(s.charAt(i), map.get(s.charAt(i))-1);
            }
        }
        // return last key in hashmap
        String result = map.toString();
        return result.charAt(1);
        }
}
