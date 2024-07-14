import java.util.Scanner;

public class averageoftwono {
    public static void main(String[] args) {
        double a, b, c, sum=0, avg=0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any three numbers: ");
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
        sum = (a+b+c);
        avg = (sum/3);
        System.out.println("The Average of "+a+" , "+b+" and "+c+" is: "+avg);
        scan.close();
    }
}