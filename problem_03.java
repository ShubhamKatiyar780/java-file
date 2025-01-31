import java.util.Scanner;

public class problem_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();

        // print Stars

        for (int i=n; i>0; i--){
            for (int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        // Sum of first n numbers using while loop

//        System.out.println("the sum of "+n+" to 1 odd numbers is: ");
        int sum = 0;
//        while (1<=n){
//           sum = sum+n;
//            n--;
//        }
//        System.out.println(sum);

        // Sum of first n even numbers using while loop

//        System.out.println("the sum of "+n+" to 1 even numbers is: ");
//        while (n>=1){
//            if (n%2==0){
//                sum = sum + n;
//            }
//            n--;
//        }
//        System.out.println(sum);
    }
}
