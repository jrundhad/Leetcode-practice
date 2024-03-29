import java.util.*;
public class nextGreaterElemII {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[nums.length];
        Arrays.fill(result, -1);

        for(int i =0; i< 2*nums.length; i++){
            while(!stack.isEmpty() && nums[stack.peek()]<nums[i%nums.length]){
                result[stack.pop()]=nums[i%nums.length];
            }
            if(i<nums.length)
                stack.push(i);
        }
        
        return result;
    }
}
