import java.util.*;

public class perfectnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int number = scanner.nextInt();

        boolean isPerfect = isPerfectNumber(number);

        if (isPerfect) {
            System.out.println(number+" is a perfect number.");
        } else{
            System.out.println(number+" is not a perfect number.");
        }
        scanner.close();
    }
    public static boolean isPerfectNumber(int number) {
        if (number <= 1) {
            return false;
        }
        int sum = 0;
        
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
}
