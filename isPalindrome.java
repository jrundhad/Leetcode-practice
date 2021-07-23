class Solution {
    public boolean isPalindrome(int x) {
        String y = Integer.toString(x);
        System.out.println(y);
        int i = 0;
        int j = y.length()  - 1;
        while (i < j){
            if(y.charAt(i)!=y.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
