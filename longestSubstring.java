public class longestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int left =0;
        int right = 0;
        int max =0;
        if(s.length()==0 || s==null){
            return 0;
        }
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        while(right<s.length()){
            if(!map.containsKey(s.charAt(right))){
                map.put(s.charAt(right), right);
            } else if(map.containsKey(s.charAt(right))){
                left = Math.max(left,map.get(s.charAt(right))+1);
                map.put(s.charAt(right), right);
            }
            max = Math.max(right-left+1, max);
            
            right ++;
            
        }
        return max;
    }
}
