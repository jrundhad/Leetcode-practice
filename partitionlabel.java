public class partitionlabel {
    public List<Integer> partitionLabels(String s) {
        if(s == null || s.length()==0){
            return null;
        }
        List<Integer> list = new ArrayList<Integer>();
        int [] map  = new int[26];
        
        for(int i=0; i<s.length(); i++){
            map[s.charAt(i)-'a'] = i;
        }
        int start = 0;
        int end = 0;
        for(int i=0; i<s.length(); i++){
            end = Math.max(end, map[s.charAt(i)-'a']);
            if(i==end){
                list.add(end-start+1);
                start = end + 1;
            }
        }
        
        return list;
    }
}
