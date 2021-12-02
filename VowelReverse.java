import java.util.*;
public class VowelReverse {
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        char[] array = s.toCharArray();
        HashSet<Character> vowels = new HashSet<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        if(s.length()==1){
            return s;
        }
        while(j>=i){
            if(vowels.contains(array[i]) && vowels.contains(array[j])){
                char storage = array[j];
                array[j]= array[i];
                array[i] = storage;
                i++;
                j--;
            }
            if(i<array.length && !vowels.contains(array[i])){
                i++;
            }
            if(j>=0 && !vowels.contains(array[j])){
                j--;
            }
        }
        return String.valueOf(array);
    }
}
