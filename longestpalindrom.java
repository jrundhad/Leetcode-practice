public class longestpalindrom {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start =0; 
        int end=0;
        for (int i = 0; i < s.length(); i++){
            int val2 = check(i,i,s);
            int val1 = check(i,i+1, s);
            int val = Math.max(val1,val2);
            if(val > end - start){
                start = i- (val-1)/2;
                end = i+ (val)/2;
            }   
        }
        return s.substring(start, end + 1);

    }
    
    public int check(int i, int j, String s){
        int l =i; int r=j;
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--; 
            r++;
        }
        return r-l-1;
    }
}
