import java.lang.reflect.Array;
import java.util.*;

public class mergeIntervals {
    public int[][] merge(int[][] intervals) {
        if(intervals.length == 0){
            return null;
        }
        List<int[]> list = new ArrayList<>();
        Arrays.sort(intervals, (a,b)-> a[0]-b[0]);
        int index=0;
        list.add(intervals[0]);
        for(int i =1; i<intervals.length; i++){
            if(intervals[i][0]<= list.get(index)[1]){
                if(list.get(index)[1]<= intervals[i][1])
                    list.get(index)[1]= intervals[i][1];
            }
            else{
                list.add(intervals[i]);
                index++;
            }
        }

        return list.toArray(new int[list.size()][]);

    }
}
