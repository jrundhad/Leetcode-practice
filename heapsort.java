import java.util.*;

public class heapsort {
    public static void main(String[] args) {
        int [] a = new int[]{9,7,2,6};
        a = sortArray(a);
        System.out.println(Arrays.toString(a));
    }

    public static int[] sortArray(int[] nums) {
        PriorityQueue<Integer> minheap = new PriorityQueue<Integer>();
        for (int i=0;i<nums.length; i++){
            minheap.add(nums[i]);
        }
        for(int i =0 ; i<nums.length;i++){
            nums[i]= minheap.poll();
        }
        return nums;
    }
}
