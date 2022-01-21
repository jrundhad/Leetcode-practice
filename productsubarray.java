import java.util.Arrays;

public class productsubarray {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int result = max;

        for(int i = 1; i<nums.length; i++){
            int temp_max= Math.max(nums[i]*min,Math.max(nums[i], nums[i]*max));
            min = Math.min(nums[i]*min,Math.min(nums[i], nums[i]*max));
            max = temp_max;
            result = Math.max(max, result);
        }

        return result;
    }

}
