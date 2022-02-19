import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class topkFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i: nums){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            } else {
                map.put(i, 1);
            }
        }

        PriorityQueue<Map.Entry<Integer, Integer>> q = new PriorityQueue<Map.Entry<Integer,Integer>>(
            (a,b) -> b.getValue() - a.getValue()
        );

        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            q.add(e);
        }

        int [] result = new int[k];

        for(int i =0; i<result.length; i++){
            result[i]= q.poll().getKey();
        }

        return result;

    }
}
