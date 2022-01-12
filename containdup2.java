import java.util.*;
public class containdup2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int left =0;
        int right =0;
        if(k==0){
            return false;
        }
        
        while(right<nums.length){
            if(set.contains(nums[right])){
                return true;
            }
            if(right-left ==k){
                set.remove(nums[left]);
                left++;
            }
            
            set.add(nums[right]);
            right ++;
            
                
            
        }
        
        return false;
    }

}
