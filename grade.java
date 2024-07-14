import java.util.Scanner;

public class grade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the score
        System.out.println("Enter the score: ");
        int score = scanner.nextInt();

        // Determine the grade using conditional statements
        char grade;

        if (score > 95) {
            grade = 'A';
        } else if (score > 85) {
            grade = 'B';
        } else if (score > 75) {
            grade = 'C';
        } else if (score > 65) {
            grade = 'D';
        } else if (score > 55) {
            grade = 'F';
        } else {
            grade = 'F';
        }

        // Output the grade
        System.out.println("The grade is: " + grade);

        scanner.close();
    }
}
