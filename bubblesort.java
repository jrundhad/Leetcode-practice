import java.util.*;

public class bubblesort {
    public static void main(String[] args) {
        int [] a = new int[]{9,7,2,6};
        a = sortArray(a);
        System.out.println(Arrays.toString(a));
    }

    public static int[] sortArray(int[] nums) {
       for(int i =0; i<nums.length; i++){
           for(int j=0; j<nums.length-1; j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1]= temp;

                }
           }
       }
       return nums;
    }
}
