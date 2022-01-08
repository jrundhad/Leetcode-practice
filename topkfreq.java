import java.util.*;
public class topkfreq {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(int i=0; i<words.length; i++){
            if(map.containsKey(words[i])){
                map.put(words[i], map.get(words[i])+1);
            } else{
                map.put(words[i], 1);
            }
        }
        List<String> list = new ArrayList<String>();
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
            (a, b) ->b.getValue() == a.getValue() ? b.getKey().compareTo(a.getKey()) : b.getValue() - a.getValue() 
        );

        for(Map.Entry<String, Integer> e : map.entrySet()){
            pq.add(e);
        }

        while(k!=0){
            list.add(pq.poll().getKey());
            k--;
        }
        return list;
        
    }
}
