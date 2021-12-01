public class longpressedname {
    public boolean isLongPressedName(String name, String typed) {
        char[] n = name.toCharArray();
        char[] t = typed.toCharArray();
        int i =0;
        int j= 0;
        if(n.length > t.length) return false;
        while(j< t.length){
            if(i< n.length && n[i]==t[j]){
                i++;
            } else if(j==0 || t[j]!=t[j-1]){
                return false;
            }
            j++;
            

        }
        if(i==n.length)
            return  true;
        else 
            return false;
    }
}
