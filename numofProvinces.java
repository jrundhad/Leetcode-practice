public class numofProvinces {
    public int findCircleNum(int[][] isConnected) {
        int count =0;
        int rows = isConnected.length;
        int columns = isConnected[0].length;
        for(int i =0; i<rows;i++){
            for(int j = 0; j<columns; j++){
                if(isConnected[i][j]==1){
                    dfs(isConnected,i,j);
                    count++;
                    System.out.println(Arrays.deepToString(isConnected));
                    System.out.println("end");
                }
            }
        }
        //System.out.println(Arrays.deepToString(isConnected));
        return count; 
    }
        
    public void dfs(int[][] grid, int i, int j){
        j=0;
        while(j<grid[i].length){
            if(i<0||i>=grid.length||j<0||j>=grid[i].length||grid[i][j]==-1){
                return;
            }else if(grid[i][j]!=0){
                grid[i][j]=-1;
                dfs(grid, j, i);         
            }

            j++;
        }
        
    }
}
