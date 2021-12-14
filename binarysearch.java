import java.util.*;

public class binarysearch {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        
        while(right>=left){
            if(nums[left] == target){
                return left;
            } 
            if(nums[right] == target){
                return right;
            }
            int midpoint = left +((right-left)/2);
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
        return -1;

    }   
}
