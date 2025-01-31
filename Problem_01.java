import java.util.Scanner;
public class Problem_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in subject1");
        int subject1 = sc.nextInt();
        System.out.println("Enter your marks in subject2");
        int subject2 = sc.nextInt();
        System.out.println("Enter your marks in subject3");
        int subject3 = sc.nextInt();

        float percentage = (subject1 + subject2 + subject3)/3f;
        System.out.println("Your Overall percentage is: " + percentage +"%");

        if (percentage>=40 && subject1>=33 && subject2>=33 && subject3>=33) {
            System.out.println("Congratulations, You are pass!");
        } else {
            System.out.println("Sorry, You are fail! Please try again.");
        }
    }
}
