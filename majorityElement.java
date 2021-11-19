import java.util.*;

public class majorityElement {
    public static void main(String[] args){
        System.out.println(solution(new int[] {3,2,3}));
    }

    public static int solution(int[] nums) {
        HashMap <Integer, Integer> table = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            if(table.get(nums[i])==null){
                table.put(nums[i], 1);
                if(table.get(nums[i])>(nums.length/2)) return nums[i];
            } else {
                table.put(nums[i], table.get(nums[i])+1);
                if(table.get(nums[i])>(nums.length/2)) return nums[i];
            }
        }

        return -1;
    }    
}
