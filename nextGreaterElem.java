import java.util.*;
public class nextGreaterElem {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        stack.push(nums2[0]);
        for(int i=1; i<nums2.length; i++){
            while(!stack.isEmpty() && stack.peek()<nums2[i]){
                map.put(stack.pop(), nums2[i]);
            }
            stack.push(nums2[i]);
        }

        for(int i=0; i<nums1.length;i++){
            nums1[i]= map.getOrDefault(nums1[i], -1)
        }

        return nums1;
    }    
}
// nums1 = [4,1,2], nums2 = [1,3,4,2]