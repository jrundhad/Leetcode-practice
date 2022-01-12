public class searchRoratedarr {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int midpoint = (right-left)/2;
            if(target==nums[left]){
                return left;
            }
            if(target==nums[right]){
                return right;
            }
            if(target==nums[midpoint]){
                return midpoint;
            }
            if(nums[left]<=nums[midpoint]){
                if(target>=nums[left] && target<=nums[midpoint]){
                    right = midpoint-1;
                }
            }
            left = midpoint+1;
        }
        return -1;
    }
}
