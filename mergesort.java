import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {
        int [] a = new int[]{9,7,2,6};
        a = sortArray(a);
        System.out.println(Arrays.toString(a));
    }

    public static int[] sortArray(int[] nums) {
        int n = nums.length;
        if(n<2){
            return nums; 
        }
        int midpoint = n/2;

        int[] left =  new int[midpoint];
        int[] right = new int[n-midpoint];
        for(int i=0 ; i<=midpoint-1; i++){
            left[i]= nums[i];

        }

        for(int i = midpoint; i<n; i++){
            right[i-midpoint]= nums[i];
        }
        sortArray(left);
        sortArray(right);
        merge(left,right,nums);
        return nums;
    }

    public static void merge(int[]l, int[]r, int[]n){
        int i=0,j=0,k=0;
        while(i<l.length && j<r.length){
            if(l[i]<=r[j]){
                n[k]= l[i];
                i++;
            } else {
                n[k]=r[j];
                j++;
            }
            k++;
        }

        while(i<l.length){
            n[k]=l[i];
            i++;
            k++;
        }
        while(j<r.length){
            n[k]=r[j];
            k++;
            j++;
        }
    }
}
