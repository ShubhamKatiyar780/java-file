import java.util.Scanner;
public class Problem_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your annual income in lacks: ");
        float income = sc.nextFloat();

        float tax = 0;
        if (income<=2.5f){
            tax = tax + 0;
        } else if (income>2.5f && income<=5f) {
            tax = tax + (5*(income - 2.5f)/100f);
        }
//        else if (income>5f && income <=10f) {
//           // tax = tax + ();
//        }
    }
}
