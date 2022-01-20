class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        int [] dp = new int [n];
        if(s.charAt(0)=='0'){
            return 0;
        }
        if(s.length()==1) return 1;
        dp[0]= 1;
        if(s.charAt(0)>'2' && s.charAt(1)=='0'){
            return 0;
        }
        if(s.charAt(1)=='0'){
            dp[1]=1;
        }
        else if(Integer.valueOf(s.substring(0,2))<=26){
            dp[1]=2;
        }else{
            dp[1]=1;
        }

        for(int i = 2; i< n ; i++){
            int x= Integer.valueOf(s.substring(i-1,i+1));
            if(x==0) return 0;
            if(s.charAt(i-1)>'2' && s.charAt(i)=='0'){
                return 0;
            }
            else if(s.charAt(i)=='0' && s.charAt(i-1)<'3')
                dp[i] = dp[i-2];
            
            else if(x>26||s.charAt(i-1)=='0') dp[i]=dp[i-1];
            else if(x<=26) {
                dp[i] = dp[i-1]+dp[i-2];
            }
            
            
        }

        return dp[n-1];

        
    }
}