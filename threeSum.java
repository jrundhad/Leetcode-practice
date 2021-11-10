import java.util.*;

public class threeSum {

    public static void main(String[] args){
        int[] intArray = new int[]{-1,0,1,2,-1,-4};
        System.out.println(solution(intArray));
    }

    public static List<List<Integer>> solution(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> result=new HashSet<>();
        for(int i=0; i<nums.length; i++){
            int num = nums[i];
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
            for(int j=i+1; j<nums.length; j++){
                //if(j==i)j++;
                //if(j==nums.length) break;
                int key = 0 - nums[i] - nums[j];
                if(map.containsKey(key)){
                    List<Integer> list= new ArrayList<Integer>(); 
                    list.add(num);
                    list.add(nums[j]);
                    list.add(key);
                    //Collections.sort(list);
                    result.add(list);
                } else {
                    map.put(nums[j], j);
                }
            }
        }
        return new ArrayList<>(result);
    }

}
//   i j  
// [-1,0,1,2,-1,-4]