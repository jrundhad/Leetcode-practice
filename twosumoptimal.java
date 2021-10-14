import java.util.*;
public class twosumoptimal {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i<nums.length; i++){
            int key = 0 - nums[i];
            if(map.containsKey(key)){
                int[] answer = {i, map.get(key)};
                return answer;
            } else {
                map.put(i, nums[i]);
            }
        }
        return null;
    }
}
