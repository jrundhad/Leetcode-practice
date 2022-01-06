import java.util.Arrays;

public class maxsubArray {
    public int maxSubArray(int[] nums) {
        int ans = nums[0];
        for(int i=1; i<nums.length; i++){
            int x = Math.max(nums[i],nums[i-1]+nums[i]);
            nums[i] = x;
            ans = Math.max(ans,x);
        }
        return ans;
    } 
}
