import java.util.List;

public class keysRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int[] visited = new int[rooms.size()];
        dfs(rooms, visited, 0);
        for(int i =0; i<visited.length; i++){
            if (visited[i]==0) return false;
        }
        return true;

    }

    private void dfs(List<List<Integer>> rooms, int[] visited, int i) {
        if(visited[i]==1 || visited[i]==2 ){
            return;
        }
        visited[i]=1;
        for(Integer j : rooms.get(i)){
            dfs(rooms, visited, j);
        }
        visited[i]=2;
        return;
    }
}
