public class flooorbinary {

    public static void main (String args []){
            int[] num = {-11,-40,-55,10,20,28,30,40};
            int target = 27;
            int ans = BinarySearch(num, target);
            System.out.println("the target is found at index: " + ans);
       
    }




    // return the index
    // return end if it not found
    static int BinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;


        while(start<=end){


            //find the middle element
            // int mid = (start + end) / 2; in this case start+end
            // value may exceed the range of integer value therefore
            int mid = start + (end - start) / 2;
            if (arr[mid]==target) {
                return mid;
            }
            else if (arr[mid]<target){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }


           
        }
        return end;


    }
}



    

