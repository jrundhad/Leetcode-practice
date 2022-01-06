import java.util.*;
public class findItin {
    public List<String> findItinerary(List<List<String>> tickets) {
        HashMap<String,PriorityQueue<String>> map = new HashMap<String, PriorityQueue<String>>();
        for(List<String> list : tickets){
            PriorityQueue<String> pq = map.getOrDefault(list.get(0), new PriorityQueue<>());
            pq.add(list.get(1));
            map.put(list.get(0), pq);
        }

        LinkedList<String> result = new LinkedList<String>();
        dfs(map,result, "JFK");
        return result;
    }

    private void dfs(HashMap<String, PriorityQueue<String>> map, LinkedList<String> result, String key) {
        PriorityQueue<String> pq =  map.getOrDefault(key, new PriorityQueue<>());
        while(!pq.isEmpty()){
            dfs(map, result, pq.poll());
        }
        result.addFirst(key);
    }
}
