import java.util.*;
public class anagram {
    public static void main(String[] args){
        System.out.println(solution("car","rac"));
    }

    public static boolean solution(String s, String t) {
        HashMap<Character, Integer> anagram = new HashMap<Character , Integer>();
        for(int i = 0; i< s.length(); i++){
            if(anagram.get(s.charAt(i))==null){
                anagram.put(s.charAt(i), 1);
            } else {
                anagram.put(s.charAt(i), anagram.get(s.charAt(i)) + 1);
            }
        }
        for(int i = 0; i<t.length(); i++){
            if(anagram.get(t.charAt(i))==null) 
                return false;
            else{
                if(anagram.get(t.charAt(i))==1) {
                anagram.remove(t.charAt(i));
                }
                else anagram.put(s.charAt(i), anagram.get(s.charAt(i)) - 1);
            }
        }
        if (anagram.size()==0)
            return true;

        return false;
    }
}
