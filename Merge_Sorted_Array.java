public class Merge_Sorted_Array {
    

     public void merge(int[] nums1, int m, int n, int[] nums2) {
        for(int j = 0, i = m ; j < n ; j++){
            nums1[i] = nums2[j];
            i++;
        }
        selection(nums1);
     }
      public static void selection(int[] arr) {
        for ( int i = 0; i < arr.length; i++){
            int last = arr.length - i - 1;
            int max = getMaxIndex(arr, 0 , last);
            swap(arr, max ,last);
        }
    }


    public static int getMaxIndex(int[] arr, int start, int last) {
        int max = start;
        for(int i = start; i <= last; i++){
            if(arr[i] > arr[max]){
                max = i;

            }
        }
            return max;
        
    }


    public static void swap(int[] arr, int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
