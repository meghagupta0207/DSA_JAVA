package Insertion_Sort;

public class Insertion_Sort_Simple {

    public static void main(String[] args){
        int[] arr = {5, 1, 4, 2, 8};
        Insertion(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void Insertion(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr,j, j-1);
                } else {
                    break;
                }
            }
        }
    }

    public static void swap(int arr[], int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
}
 