import java.util.*;

public class rottingOranges {
    public int orangesRotting(int[][] grid) {
        Queue<int []> q = new LinkedList<int []>();
        int rows = grid.length;
        int colums = grid[0].length;
        int minutes = 0;

        for(int i =0;i<rows; i++){
            for(int j =0; j<colums; j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }
            }
        }
        int[][]directions = {{1,0}, {-1,0}, {0,1}, {0, -1}};
        while(!q.isEmpty()){
            int size = q.size();
            for(int i =0; i<size; i++){
                int [] cords = q.poll();
                for(int[] d  : directions){
                    int newrow = cords[0]+d[0];
                    int newcol = cords[1]+d[1];
                    if(newrow>=0 && newrow<rows && newcol>=0 && newcol<colums && grid[newrow][newcol]==1){
                        q.add(new int[]{newrow, newcol});
                        grid[newrow][newcol]=2;
                    }
                }

            }
            minutes++;
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<colums;j++){
                if(grid[i][j]==1){return -1;}
            }
        }
        
        return minutes==0? 0: minutes-1;
    }
}
