import java.util.*;
public class ransom {
    public static void main(String[] args){
        System.out.println(solution("aa","ab"));
    }

    public static boolean solution(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        //insert magazin character to hash map and the count of each character
        for(int i=0; i<magazine.length();i++){
            if(map.get(magazine.charAt(i))==null){
                map.put(magazine.charAt(i), 1);
            } else {
                map.put(magazine.charAt(i), map.get(magazine.charAt(i)) + 1);
            }
        }
        //go thorugh characters of ransomNote and remove accordingly if key not in map return false
        for(int i=0; i<ransomNote.length(); i++){
            if(map.get(ransomNote.charAt(i))==null){
                return false;
            } else if(map.get(ransomNote.charAt(i))==1){
                map.remove(ransomNote.charAt(i));
            } else{
                map.put(ransomNote.charAt(i), map.get(ransomNote.charAt(i))-1);
            }
        }

        return true;
        }
}

