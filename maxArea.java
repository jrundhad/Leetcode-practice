public class maxArea {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        int rows = grid.length;
        int columns = grid[0].length;
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                if(grid[i][j]==1){
                    int area = dfs(grid,i,j);
                    max  = Math.max(area, max);
                }
            }
        }
        return max;
    }
    
    public int dfs(int[][]grid, int i, int j){
        int area = 0;
        if(i<0||i>=grid.length||j<0||j>=grid[i].length||grid[i][j]==0){
            return area;
        }
        grid[i][j]=0;
        area++;
        area =area+ dfs(grid, i-1, j)+dfs(grid, i+1, j)+ dfs(grid, i, j+1)+ dfs(grid, i, j-1);
        return area;
    }
}
