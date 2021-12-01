import java.util.*;


public class rescueboats {

    public int numRescueBoats(int[] people, int limit) {
        int boats =0;
        Arrays.sort(people);
        int end= people.length-1;
        int start=0;
        while (end>=start){
            if(people[start]+people[end]<= limit){
                boats++;
                start++;
                end--;
            }else{
                boats++;
                end--;
            }
        }
        return boats;
    }
}
