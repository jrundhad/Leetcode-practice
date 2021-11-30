import java.util.*;

public class subsequence {

    public boolean isSubsequence(String s, String t) {
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        int i = 0;
        int j = 0;
        
        if(a.length==0 && b.length==0 ){
            return true;
        } else if(b.length==0){
            return false;
        }
        while(i<a.length){
            char apoint = a[i];
            char bpoint = b[j];
            if(apoint == bpoint){
                i++;
                j++;
                if(j==b.length && i<a.length){
                    return false;
                }
            } else {
                j++;
                if(j==b.length){
                    return false;
                }
            }
            
        }

        return true;

    }
}
