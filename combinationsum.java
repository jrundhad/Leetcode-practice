import java.util.*;

public class combinationsum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if(candidates.length == 0){
            return null;
        }
        findcombination(candidates,target, 0, result, new ArrayList<>());
        return result;
    }

    public void findcombination(int[] candidates, int target, int index, List<List<Integer>> result, List<Integer> current){
        if(target==0){
            result.add(new ArrayList<Integer>(current));
            return;
        }
        for(int i= index; i<candidates.length; i++){
            if(candidates[i]<= target){
                current.add(candidates[i]);
                findcombination(candidates, target- candidates[i], i, result, current);
                current.remove(current.size()-1);
            }
        }
    }
}
