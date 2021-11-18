import java.util.*;

public class arrayIntersection {
    public static void main(String[] args){
        System.out.println(Arrays.toString(solution(new int[] {1,2,2,1}, new int[] {2,2})));
    }

    public static int[] solution(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<Integer>();
        HashSet<Integer> ans = new HashSet<Integer>();
        for(int i=0; i<nums1.length; i++){
            set.add(nums1[i]);
        }
        for(int i=0; i<nums2.length; i++){
            if(set.contains(nums2[i])){
                ans.add(nums2[i]);
            }
        }
        int[] res = new int[ans.size()];
        int index = 0;
        for(int answer: ans) {
            res[index] = answer;
            index++;
        }
        
        return res;
    }
}
