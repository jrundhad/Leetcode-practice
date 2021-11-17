import java.util.*;

public class jewelStones {
    public static void main(String[] args){
        System.out.println(solution("car","rac"));
    }

    public static int solution(String jewels, String stones) {
        int count = 0;
        HashSet<Character> set = new HashSet<Character>();
        for(int i = 0; i<jewels.length(); i++){
            set.add(jewels.charAt(i));
        }
        for(int i=0; i<stones.length(); i++){
            if(set.contains(stones.charAt(i))){
                count ++;
            }
        }
        return count;
    }
}
