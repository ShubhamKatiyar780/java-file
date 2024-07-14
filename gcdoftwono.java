import java.util.Scanner;

public class gcdoftwono {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int number2 = scanner.nextInt();
        //calculate the GCD
        int gcd = findGCD(number1, number2);
    //     while (number2 != 0) {
    //         int  temp = number2;
    //         number2 = number1%number2;
    //         number1 = temp;
    //     }
    //    int gcd = number1;
        System.out.println("The GCD of "+number1+" and "+number2+ " is: "+gcd);
        scanner.close();
    }
    //method to find GCD
    public static int findGCD (int a, int b) {
        while (b!=0) {
            int temp = b;
            b = a%b;
            a = temp;
        }
            return a;
    }
}
