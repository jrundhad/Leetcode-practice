import java.util.*;

public class uniquechar {
    public static void main(String[] args){
        System.out.println(solution("abcded"));
    }

    public static int solution(String s) {
        HashMap<Character, Integer> map = new HashMap<Character , Integer>();
        for(int i = 0; i< s.length(); i++){
            if(map.get(s.charAt(i))==null){
                map.put(s.charAt(i), 1);
            } else {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
        }
        System.out.println(map.toString());
        for(int i = 0; i< s.length(); i++){
            if(map.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}
