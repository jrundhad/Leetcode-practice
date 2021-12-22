// leetcode 1020

public class enclaves {
    public int numEnclaves(int[][] grid) {
        int count = 0;
        int rows = grid.length;
        int columns = grid[0].length;
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                if(i==0||i==grid.length-1||j==0||j==grid[i].length-1)
                    if(grid[i][j]==1 ){
                        dfs(grid,i,j);
                    }
            }
        }
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                if(grid[i][j]==1){
                    count++;
                }
            }
         }
         return count;
    }

    public void dfs(int[][]grid, int i, int j){
        if(i<0||i>=grid.length||j<0||j>=grid[i].length||grid[i][j]==0){
            return;
        }
        grid[i][j]=0;
        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);

    }
}
