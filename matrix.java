import java.util.*;
public class matrix {
    public int[][] updateMatrix(int[][] mat) {
        int rows = mat.length;
        int columns =mat[0].length;
        Queue<int[]> q = new LinkedList<int []>();
        int [][] directions = {{1,0},{-1,0},{0,1},{0,-1}};

        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                if(mat[i][j]==0)
                    q.add(new int []{i,j});
                else{
                    mat[i][j]=Integer.MAX_VALUE;
                }
            }
        }

        while(!q.isEmpty()){
            int size = q.size();
            for(int i =0;i<size;i++){
                int[] cords = q.poll();
                for(int [] d : directions){
                    System.out.println(Arrays.toString(cords));
                    int newrow = cords[0]+d[0];
                    int newcol = cords[1]+d[1];
                    int oldval = mat[cords[0]][cords[1]];
                    if(newrow>=0 && newrow<rows && newcol>=0 && newcol<columns && oldval+1<mat[newrow][newcol]){
                        q.add(new int[]{newcol,newrow});
                        mat[newrow][newcol]=oldval+1;
                    }
                }

            }
        }

        return mat;

    }

}
