public class condition {
    public static void main(String[] args)
    {
        /*for loop */
        System.out.println("For Loop:");
        for ( int i=1 ; i<=5 ; i++){
            System.out.println(i);
        }

        /*while loop */
        System.out.println("While Loop:");
        int num = 1;
        while(num <= 5){
            System.out.println(num);
            num++;
        }

        /*do while loop */
        System.out.println("Do While Loop:");
        int n = 1;
        do{
            System.out.println(n);
            n++;
        } while(n <= 5);
    }
}
