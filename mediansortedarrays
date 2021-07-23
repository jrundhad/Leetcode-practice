class main {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] arr = new int [m+n];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<arr.length && j < m && k<n){
            if(nums1[j]<=nums2[k]){
                arr[i]= nums1[j];
                i++;
                j++;
            }else{
                arr[i]=nums2[k];
                i++;
                k++;
            }
        }
        while(j<m && i<arr.length){
            arr[i] =  nums1[j];
            j++;
            i++;
        }
        while(k<n && i<arr.length){
            arr[i] =  nums2[k];
            k++;
            i++;
        }
        if(arr.length % 2 == 0){
            return ( arr[arr.length/2] + arr[(arr.length/2)-1]) / 2.0;
        } else 
            return arr[arr.length/2];
    }
    public static void main(String args[]) 
    { 
        int[] a = {1,2,3};
        int[] b = {4,5};
        double x = findMedianSortedArrays(a,b);
        System.out.println(x);
    } 
}