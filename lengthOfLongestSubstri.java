class Solution {
    
    public int lengthOfLongestSubstring(String s) {
        int count= 0;
        if (s.length() == 1)
            count = 1;
        for(int i = 0; i < s.length(); i++ ){
            for(int j = i+1; j <= s.length(); j++ ){
                if(unique(s, i , j)){
                    if(j-i> count)
                        count = j-i;
                    }
                } 
            }
        return count;
        }
    
    
    
    public boolean unique(String s, int start, int end){
        Set<Character> set = new HashSet<>();
        while(start < end ){
            Character ch = s.charAt(start);
            if (set.contains(ch))
                return false;
            set.add(ch);
            start++;
        }
        return true;
    }
}
