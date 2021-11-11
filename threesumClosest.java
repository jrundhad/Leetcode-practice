import java.util.*;
public class threesumClosest {
    public static void main(String[] args){
        int[] intArray = new int[]{1,1,1,0};
        System.out.println(solution(intArray,-100));
    }

    public static int solution(int[] nums, int target){
        int result = nums[0]+ nums[1]+nums[2];
        int initial = (nums[0]+ nums[1]+nums[2]);
        int difference = Math.max(target, initial)- Math.min(target,initial);
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    int compare = Math.max(target, sum)- Math.min(target,sum);
                    if(difference > compare){
                        result = sum;
                        difference = compare;
                    }
                }
            }
        }

        return result;
    }
}
