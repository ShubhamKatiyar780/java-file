import java.util.Scanner;

public class SumOfNumbers {

    public static int sumRecursive(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumRecursive(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate the sum of numbers from 1 to that number: ");
        int number = scanner.nextInt();
        int result = sumRecursive(number);
        System.out.println("Sum of numbers from 1 to " + number + " is " + result);
        scanner.close();
    }
}
