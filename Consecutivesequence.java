import java.util.HashSet;

public class Consecutivesequence {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int maxSeq =0;
        for(int i=0; i< nums.length; i++){
            int curSeq =1;
            int currentNum = nums[i];
            if(!set.contains(currentNum-1)){
                while(set.contains(currentNum+1)){
                    curSeq++;
                    currentNum++;
                } 
            }
            maxSeq = Math.max(curSeq, maxSeq);
            
        }

        return maxSeq;

    }
}
