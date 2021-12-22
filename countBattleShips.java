public class countBattleShips {
    public int countBattleships(char[][] board) {
        int count = 0 ;
        int rows = board.length;
        int columns = board[0].length;
        
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                if(board[i][j]=='X'){
                    count = count + 1;
                    dfs(board,i,j);
                }
            }
        }
        return count;
    }

    public void dfs(char[][]board, int i, int j){
        if(i<0||i>=board.length||j<0||j>=board[i].length||board[i][j]=='.'){
            return;
        }
        board[i][j]='.';
        dfs(board, i+1, j);
        dfs(board, i-1, j);
        dfs(board, i, j+1);
        dfs(board, i, j-1);
    }
}
