import java.util.*;

public class kthsmallestmatrix {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                pq.add(matrix[i][j]);
            }
        }

        int result = pq.poll();
        k--;

        while(k!=0 && !pq.isEmpty()){
            result = pq.poll();
            k--;

        }

        return result;
    }
}
