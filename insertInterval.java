import java.util.*;

public class insertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if(intervals.length==0){
            return new int[][]{{newInterval[0],newInterval[1]}};
        }

        int start = newInterval[0];
        int end = newInterval[1];
        List<int[]> list = new ArrayList<>();
        int i =0;
        while( i< intervals.length){
            if(start<=intervals[i][1]){
                start = Math.min(start, intervals[i][0]);
                break;
            }
            list.add(intervals[i]);
            i++;
        }

        while(i< intervals.length){
            if(end<=intervals[i][1] && end>=intervals[i][0]){
                end = Math.max(end,intervals[i][1]);
                i++;
                break;
            }
            if(end<=intervals[i][0]){
                break;
            }
            i++;
        }

        list.add(new int[]{start, end});
        while(i<intervals.length){
            list.add(intervals[i]);
            i++;
        }
    
        return list.toArray(new int[list.size()][]);
    }
}
