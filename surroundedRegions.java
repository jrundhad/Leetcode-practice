public class surroundedRegions {
    public void solve(char[][] board) {
        int rows = board.length;
        int columns = board[0].length;
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                if(i==0||i==board.length-1||j==0||j==board[i].length-1)
                    if(board[i][j]=='O' ){
                        dfs(board,i,j);
                    }
            }
        }
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                if(board[i][j]=='O'){
                    board[i][j]='X';
                }
                if(board[i][j]=='1'){
                    board[i][j]='O';
                }
            }
         }
    }
    public void dfs(char[][]grid, int i, int j){
        if(i<0||i>=grid.length||j<0||j>=grid[i].length||grid[i][j]!='O'){
            return;
        }
        grid[i][j]='1';
        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);

    }
}
