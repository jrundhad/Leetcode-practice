public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int count = 0, i = 0, j = 0;
        while(i< s.length() && j <s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                count = Math.max(count, j-i);
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return count;
    }
}
