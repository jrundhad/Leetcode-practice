import java.util.Arrays;

public class cookies {
    public int findContentChildren(int[] g, int[] s) {
        
        if(s.length==0){
            return 0;
        }

        Arrays.sort(g);
        Arrays.sort(s);

        int i=0;
        int j = 0;
        int count =0;
        while(j<s.length){
            if(i<g.length && g[i]<=s[j]){
                i++;
                count++;
            }
            j++;
        }
        return count;
    }
    
}
