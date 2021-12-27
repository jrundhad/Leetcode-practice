import java.util.*;

public class frequency {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i=0; i<s.length(); i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), 1);
            }
            else{
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
        }
        
        PriorityQueue<Map.Entry<Character,Integer>> pq= new PriorityQueue<>(
            (a, b) ->b.getValue() != a.getValue() ? b.getValue() - a.getValue() : b.getKey() - a.getKey()
        );

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            pq.add(entry);
        }

        StringBuilder result= new StringBuilder();
        while(!pq.isEmpty()){
            Map.Entry<Character, Integer> set =pq.poll();
            char c = set.getKey();
            int freq = set.getValue();
            for(int i=0 ; i<freq; i++){
                result.append(c);
            }
        }
        return result.toString();
    }
}
