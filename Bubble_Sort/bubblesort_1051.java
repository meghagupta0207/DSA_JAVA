public class bubblesort_1051 {

public static void main(String args[]){
    int count = 0;
    int arr[] = {5, 1, 4, 2, 8};
    int clone_arr[] = arr.clone();

    bubblesort_function(arr);
    for(int i = 0; i < arr.length; i++){
        if(arr[i] != clone_arr[i]){
            count++;
        }
        System.out.print(arr[i] + " ");
    }
    System.out.println("\nNumber of swaps: " + count);
}


        public static void bubblesort_function(int arr[]){
            for(int i = 0; i < arr.length -1 ; i++){
                for(int j = 0; j <arr.length - i - 1; j++){
                    if(arr[j] > arr[j + 1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
        
    
    
}
