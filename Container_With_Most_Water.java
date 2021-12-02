import java.util.*;
public class Container_With_Most_Water {
    public int maxArea(int[] height) {
        int i=0;
        int j = height.length-1;
        int maximum = 0;
        while(j>=i){
             int area = Math.min(height[j], height[i]) * (j-i);
             maximum = Math.max(maximum, area);

             if(height[j]>height[i]){
                i++;
             } else{
                j--;
             }
        
        }
        return maximum;
    }
}
