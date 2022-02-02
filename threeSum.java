import java.util.*;

public class threeSum {

    public static void main(String[] args){
        int[] intArray = new int[]{-1,0,1,2,-1,-4};
        System.out.println(solution(intArray));
    }

    public static List<List<Integer>> solution(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(nums.length==0|| nums==null){
            return result;
        }
        Arrays.sort(nums);
        for(int i =0; i<nums.length-2; i++){
            if(i==0 || (i>0 && nums[i]!= nums[i-1])){
                int low = i+1;
                int high = nums.length-1;
                int sum = 0-nums[i];

                while(low < high){
                    if(nums[low]+nums[high]==sum){
                        result.add(Arrays.asList(nums[i],nums[low],nums[high]));
                        while(low < high && nums[low]==nums[low+1]) low++;
                        while(low < high && nums[high]== nums[high-1]) high--;
                        low++;
                        high--;
                    } else if(nums[low]+nums[high]>sum){
                        high--;
                    } else{
                        low ++;
                    }
                }
            }
        }
        return result;
    }

}
//   i j  
// [-1,0,1,2,-1,-4]