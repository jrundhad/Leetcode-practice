public class most_water_better_solution {
    public int maxArea(int[] height) {
        int max = 0;
        int left_side = 0;
        int right_side = height.length - 1;
        while (left_side < right_side){
            int left_value = height[left_side];
            int right_value = height[right_side];
            int area = Math.min(left_value,right_value) * (right_side - left_side) ;
            max = Math.max(max,area);
            if(left_value > right_value)
                right_side --;
            else left_side ++;
        }
        return max;    
    }
}
