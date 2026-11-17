package Selection_Sort;

public class selection_sort {


    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        selection(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
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
