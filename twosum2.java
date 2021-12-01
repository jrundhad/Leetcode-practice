import java.util.*;
public class twosum2 {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length-1;
        while(i<j){
            if(numbers[i]+numbers[j]==target){
                int[] a = new int[]{i+1,j+1};
                return a;
            } else if (numbers[i]+numbers[j]>= target){
                j--;
            } else{
                i++;
            }
        }
        return new int[]{-1};

    }
}
