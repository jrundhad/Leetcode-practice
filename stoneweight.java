import java.util.*;
public class stoneweight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(
            (a, b) -> b - a 
        );
        for(int i=0; i<stones.length; i++){
            heap.add(stones[i]);
        }
        int one =0;
        while(!heap.isEmpty()){
            one = heap.poll();
            if(!heap.isEmpty()){
                int two = heap.poll();
                int result = Math.max(one, two)-Math.min(one, two);
                heap.add(result);
            } 
        }

        return one;
        
    }
}
