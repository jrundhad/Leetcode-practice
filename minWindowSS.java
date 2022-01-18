import java.util.*;

public class minWindowSS {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i =0; i<t.length(); i++){
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0)+1);
        }
        int lettersNeeded = map.size();
        int left =0;
        int right = 0;
        int minWinow = s.length();
        int leftind = 0;
        int rightind = 0;

        while(right<s.length()){
            char endchar = s.charAt(right);
            right++;
            if(map.containsKey(endchar)){
                map.put(endchar, map.get(endchar)-1);
                if(map.get(endchar)==0){
                    lettersNeeded--;
                }
            }

            if(lettersNeeded>0) continue;

            while(lettersNeeded==0){
                char startchar = s.charAt(left);
                left++;
                if(map.containsKey(startchar)){
                    map.put(startchar, map.get(startchar)+1);
                    if(map.get(startchar)>0){
                        lettersNeeded++;
                    }
                }

            }
            
            if(right - left<minWinow){
                minWinow= right-left;
                leftind = left;
                rightind = right;
            }
        }

        return minWinow==s.length() ? "" : s.substring(leftind-1, rightind);

    }
}
