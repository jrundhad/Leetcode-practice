public class productArray {
    public int[] productExceptSelf(int[] nums) {
        int [] result = new int [nums.length];
        result[0]=1;
        for(int i=1; i<nums.length; i++){
            result[i] = nums[i-1] * result[i-1];
        }
        int prev =1;
        for(int i=nums.length-1; i>=0; i--){
            result[i]= result[i] * prev;
            prev = prev * nums[i];
        }
        return result;
    } 
}