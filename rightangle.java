import java.util.Scanner;

public class rightangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = scanner.nextInt();

        // if (x % 2 == 0) {
        //     System.out.println(x + " is even.");
        // } else {
        //     System.out.println(x + " is odd.");
        // }

        // without using arithmetic operators
        if ((x & 1) == 0) {
            System.out.println(x + " is even.");
        } else {
            System.out.println(x + " is odd.");
        }
        
        scanner.close();
    }
}
 
  