import java.security.KeyStore.Entry;
import java.util.*;
public class courseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if(prerequisites.length==0){
            return true;
        }

        HashMap<Integer,ArrayList<Integer>> map  = createGraph(prerequisites, numCourses);

        Boolean[] cache = new Boolean[numCourses];
        
        // Iterate through all courses checking if you can finish them.
        for(int i = 0; i < numCourses; i++) {
            if(!canFinish(map, i, cache)) return false;
        }
        
        return true;
    }

    public HashMap<Integer,ArrayList<Integer>> createGraph(int[][] prerequisites, int numCourses){
        HashMap<Integer,ArrayList<Integer>> map  = new HashMap<>();
        for(int i = 0; i < numCourses; i++) {
            map.put(i,new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length; i++){
                map.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        return map;
    }

    private boolean canFinish(Map<Integer, ArrayList<Integer>> courses, int curCourse, Boolean[] cache){
        // If course has already been processed return.
        if(cache[curCourse] != null) return cache[curCourse];
        
        // Mark course as not finished in cache
        cache[curCourse] = false;
        
        // Check to see if curCourse has prereqs that can also be finished.
        for(int course : courses.get(curCourse)){
            // If course can't finish, return false.
            if(!canFinish(courses, course, cache)){
                return false;
            }
        }
       
        // Mark course as finished in cache and return that course has finished.
        cache[curCourse] = true;
        return true;
    }
}

// 1 -> 0
// |    \
//  \    v
//    ->  2