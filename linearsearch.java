public class linearsearch {
    public static void main(String arg[]) {
        int[] num = {10,20,30,40,-11,-40,-55,28};
        int target = 28;
        int ans = ls(num, target);
        System.out.println("the target is found at index: " + ans);
    }


        static int ls(int[] arr, int target) {

            for (int index = 0 ; index < arr.length ; index++ ) {
                if (arr[index] == target) {
                    return index;
                }
            }
            return -1;
        }
    }

