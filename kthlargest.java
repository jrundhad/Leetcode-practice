import java.util.*;
public class kthlargest {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(
            (a,b) -> b - a
        );
        for(int i=0; i<nums.length; i++){
            heap.add(nums[i]);
        }
        
        int i=1;
        while(i<k){
            heap.poll();
            i++;
        }
        return heap.poll();


    }
}
