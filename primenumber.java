import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime == true) {
            System.out.println(number + " is a Prime Number.");
        } else if (number == 2) {
            System.out.println(number + " is a Smallest Prime Number.");
        } else if (number < 0) {
            System.out.println(number + " is a invalid Number.");
        } else {
            System.out.println(number + " is not a Prime Number.");
        }
        scanner.close();
    }
}