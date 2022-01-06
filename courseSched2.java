import java.util.*;
public class courseSched2 {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<Integer>[] adjlist  = createGraph(prerequisites, numCourses);
        int[] visited = new int[numCourses];
        LinkedList<Integer> result = new LinkedList<Integer>();
        boolean x = false;

        for(int i=0;i<visited.length;i++){
            x = dfs(adjlist,visited, i, result);
            if(x==false){
                break;
            }
        }
        System.out.println(x);
        if(x){
            for(int i=0; i<result.size(); i++){
            visited[i]= result.get(i);
            }
            return visited;
        }
        return new int[]{};
    }

    private boolean dfs(ArrayList<Integer>[] adjlist, int[] visited, int i, LinkedList<Integer> result) {
        ArrayList<Integer> list = adjlist[i];
        if(visited[i]==1){
            return false;
        }
        if(visited[i]==2){
            return true;
        }
        visited[i]=1;
        
        if(list.isEmpty()){
            visited[i]=2;
            result.addFirst(i);
            return true;
        }else{
            for(int k : list){
                if(!dfs(adjlist, visited, k, result)) {
                    return false;
                }
            }
            result.add(i);
            visited[i]=2;
            return true;
        }
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
