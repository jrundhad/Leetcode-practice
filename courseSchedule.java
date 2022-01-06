import java.security.KeyStore.Entry;
import java.util.*;
public class courseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<Integer>[] adjlist  = createGraph(prerequisites, numCourses);
        int[] visited = new int[numCourses];
        
        for(int i=0; i<numCourses; i++){
            if(visited[i]==0 && !dfs(adjlist, visited, i)) return false;
        }
        return true;


    }

    public boolean dfs(ArrayList<Integer>[] adjlist, int[] visited, int node){
        if(visited[node]==1){
            return false;
        }
        if(visited[node]==2){
            return true;
        }
        visited[node] = 1;
        for(int next : adjlist[node]){
            if(!dfs(adjlist, visited, next)) return false;
        }
        
        visited[node]=2;
        return true;

    }

    public ArrayList<Integer>[] createGraph(int[][] prerequisites, int numCourses){
        ArrayList<Integer>[] adjlist = new ArrayList[numCourses];
        for(int i = 0; i < numCourses; i++) {
            adjlist[i]= new ArrayList<>();
        }
        for(int i=0;i<prerequisites.length; i++){
                adjlist[prerequisites[i][0]].add(prerequisites[i][1]);
        }
        return adjlist;
    }
}

// 1 -> 0
// |    \
//  \    v
//    ->  2