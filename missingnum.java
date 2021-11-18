import java.util.*;
// testing
public class missingnum {
    public static void main(String[] args){
        System.out.println(solution(new int[]{ 0,1,2,3,4,5,6,7,8}));
    }

    public static int solution(int[] nums) {
        HashSet<Integer> set =  new HashSet<Integer>();
        for(int i = 0; i< nums.length; i++){
            set.add(nums[i]);
        }
        for (int i=0;i<nums.length+1;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return 0;
        
    }
    
}
