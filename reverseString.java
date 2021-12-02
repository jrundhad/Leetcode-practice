public class reverseString {
    public void reverseTheString(char[] s) {
        int i = 0;
        int j = s.length-1;
        while(j>=i && s.length>1){
            char storage = s[j];
            s[j]= s[i];
            s[i] = storage;
            j--;
            i++;
        }
    }
}
