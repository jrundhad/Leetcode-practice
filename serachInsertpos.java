public class serachInsertpos {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int midpoint = left +((right-left)/2);
        while(right>=left){
            if(nums[left] == target){
                return left;
            } 
            if(nums[right] == target){
                return right;
            }
            midpoint = left +((right-left)/2);
            if(nums[midpoint]==target){
                return midpoint;
            }
            if(nums[midpoint]>=target){
                right = midpoint-1;
            }
            else{
                left = midpoint+1;
            }

        }
        if(target>nums[midpoint]){
            return midpoint+1;
        }else 
            return midpoint;
    }
}
