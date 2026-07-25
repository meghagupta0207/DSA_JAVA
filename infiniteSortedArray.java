public class infiniteSortedArray {

    public static void main(String[] args){
        int[] arr = {-10,-5,0,3,7,9,12,15,20,25,30};
        int target = 7;
        System.out.println(Rangeans(arr, target));

    }

    static int Rangeans(int[] arr, int target){

        int start = 0;
        int end = 1;

        while (target > arr[end]){
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return BinarySearch(arr, target, start, end);
    }

    static int BinarySearch(int[] arr, int target, int start, int end) {
         while(start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
         }
         return -1;
    }


    }
    

