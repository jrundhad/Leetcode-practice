class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] answer;
        answer = new int [2];
        for(int i=0; i<nums.length; i++){
            for (int j=0;j<nums.length; j++){
                if(j == i ){
                    j = j+1;
                }
                if (target == nums[i]+ nums[j]){
                    answer[0] = i;
                    answer[1] = j;
                    return answer;
                }
            }
        }
        return answer;
    }
}