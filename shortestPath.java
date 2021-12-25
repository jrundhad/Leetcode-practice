import java.util.*;

public class shortestPath {
    public int shortestPathBinaryMatrix(int[][] grid) {
        Queue<int []> q = new LinkedList<int []>();
        int rows = grid.length;
        int columns = rows;
        int count = 1;
        int[][]directions = {{1,0}, {-1,0}, {0,1}, {0, -1}, {-1,-1}, {-1,1}, {1,1}, {1,-1}};

        if(grid[0][0]==1 || grid[rows-1][columns-1]==1){
            return -1;
        }
        
        if(rows==1){
            return 1;
        }

        q.add(new int[]{0,0});
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0; i<size;i++){
                int[] cords = q.poll();
                for(int[] d :directions){
                    int newrow = cords[0]+d[0];
                    int newcol = cords[1]+d[1];
                    if(newrow>=0 && newrow<rows && newcol>=0 && newcol<columns && grid[newrow][newcol]==0){
                        q.add(new int[]{newrow, newcol});
                        if(newrow == rows-1 && newcol==newrow){
                            return count + 1;
                        }
                        grid[newrow][newcol]=-1;
                    }
                }
            }
            count++;
        }
        
        return -1;
    }
}
