import java.util.*;


public class farfromLand {
    public int maxDistance(int[][] grid) {
        int width = grid.length;
        int count =0;
        Queue <int[]> q = new LinkedList<int[]>();
        int [][] directions = {{1,0}, {-1,0}, {0,1}, {0, -1}};

        for(int i=0; i<width; i++){
            for(int j=0; j<width; j++){
                if(grid[i][j]==1){
                    q.add(new int[]{i,j});
                }
            }
        }

        while(!q.isEmpty()){
            int size = q.size();
            for( int i=0; i<size; i++){
                int[] cords = q.poll();
                for(int[] d : directions){
                    int newrow = cords[0]+d[0];
                    int newcol = cords[1]+d[1];
                    if(newrow>=0 && newrow<width && newcol>=0 && newcol<width && grid[newrow][newcol]==0){
                        q.add(new int[]{newrow,newcol});
                        grid[newrow][newcol]=1;
                    }
                }
            }
            count++;
        }
        count --;
        return count==0 ? -1 : count;
    }
}
// [1,0,1]
// [0,0,0]
// [1,0,1]
//size = 3
// cords = {0,0}
// new cords ={0,1}
// q {0,2}, {2,0}, {2,2}, {1,0}, {0,1}