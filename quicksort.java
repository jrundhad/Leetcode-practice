import java.util.*;

public class quicksort {
    public static void main(String[] args) {
        int [] a = new int[]{9,7,2,6};
        a = sortArray(a);
        System.out.println(Arrays.toString(a));
    }

    public static int[] sortArray(int[] nums) {
        return (quicksorter(nums, 0, nums.length-1));

    }

    public static int[] quicksorter(int[] array, int left, int right){
        if(left>= right){
            return array;
        }
        int pivot = array[(left+right)/2];
        int index = partition(array, left, right, pivot);
        quicksorter(array, left, index-1);
        quicksorter(array, index, right);
        return array;
    }

    public static int partition(int[] array, int left, int right, int pivot){
        while(left <= right){
            while(array[left]< pivot){
                left++;
            }
            while(array[right]> pivot){
                right --;
            }
            if(left <= right){
                int temp = array[right];
                array[right]= array[left];
                array[left] = temp;
                left++;
                right--;
            }
        }

        return left;
    }


}
