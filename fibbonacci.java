public class fibbonacci {
    public int fib(int n) {
        if(n == 0){
            return 0;
        } if(n==1){
            return 1;
        }
        
        int [] fibArr = new int[n+1];
        fibArr[0] = 0;
        fibArr[1] = 1;
        for(int i =2; i<fibArr.length; i++){
            fibArr[i] = fibArr[i-1] + fibArr[i-2];
        }
        
        return fibArr[n];
    }
}
