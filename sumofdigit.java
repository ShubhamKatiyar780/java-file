import java.util.Scanner;

public class sumofdigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int number = scanner.nextInt();
        int sum = 0;
        while (number != 0) {
            int digit = number % 10; // Extract the last digit
            sum += digit;            // Add the digit to the sum
            number /= 10;            // Remove the last digit
        }
        System.out.println("The sum of the digits is: " + sum);
        scanner.close();
    }
}
