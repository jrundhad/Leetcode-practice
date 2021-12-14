public class findfirstandlastpos {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0){
            return new int[]{-1,-1};
        }
        int left = 0;
        int right = nums.length-1;
        int leftpos= -1;
        int rightpos = -1;
        int midpoint = left +((right-left)/2);

        while(right>=left){
            if(nums[left] == target){
                midpoint = left;
                break;
            } 
            if(nums[right] == target){
                midpoint = right;
                break;
            }

            midpoint = left +((right-left)/2);

            if(nums[midpoint]==target){
                break;
            }
            if(nums[midpoint]>=target){
                right = midpoint-1;
            }
            else{
                left = midpoint+1;
            }
        }
        if(nums[midpoint]!= target){
            return new int[]{leftpos,rightpos};
        }
        
        leftpos = midpoint;
        rightpos = midpoint;
        
        while(leftpos>=0 && nums[leftpos]==target){
            leftpos--;
        }
        leftpos= leftpos + 1;
        while(rightpos<nums.length && nums[rightpos]==target){
            rightpos++;
        }
        rightpos = rightpos -1;
        return new int[]{leftpos,rightpos};

    }

}

