public class Container_With_Most_Water {
    public int maxArea(int[] height) {
        int max = 0;
        for(int i=0; i<height.length; i++){
            int value = height[i];
            for(int j=0; j<height.length; j++)
                if(height[j]>= value){
                    if(value * java.lang.Math.abs(i-j) > max){
                        max = value * java.lang.Math.abs(i-j);
                    }
                }
        }
        return max;    
    }
}
