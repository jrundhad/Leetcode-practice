public class jumpGame {
    public boolean canJump(int[] nums) {
        if(nums.length==1){
            return true;
        }
        int jumps=nums[0];
        int i =1;
        while(jumps>0 && i<nums.length){
            jumps --;
            if(i==nums.length -1){
                return true;
            }
            jumps = Math.max(jumps, nums[i]);
            i++;
             
        }
        
        return false;
        
    }
}
