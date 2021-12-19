import java.util.Arrays;

public class islands {
    public int numIslands(char[][] grid) {
        int count =0;
        int rows = grid.length;
        int columns = grid[0].length;
        // find places on grid that is an island 
        for(int i =0; i<rows;i++){
            for(int j = 0; j<columns; j++){
                if(grid[i][j]=='1'){
                    count ++;
                    dfs(grid,i,j);
                }
            }
        }
        return count; 
    }
    
    public void dfs(char[][] grid, int i, int j){
        if(i<0||i>=grid.length||j<0||j>=grid[i].length||grid[i][j]=='0'){
            return;
        }
        grid[i][j]='0';
        dfs(grid, i-1, j);
        dfs(grid, i+1, j);
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);
    }
}
