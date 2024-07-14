import java.util.Scanner;
import java.util.Random;
public class game {
    public static void main(String[] args) {
        System.out.println("Welcome in the Game of Rock, Paper and Scissor!");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice (0 for rock, 1 for paper, 2 for scissors): ");
        int playerChoice = sc.nextInt();
        System.out.println("Your Choice is: " + playerChoice);

        // for generating random number by the system
        Random rd = new Random();
        int computerChoice = rd.nextInt(3);
        System.out.println("Computer Choice is: " + computerChoice);

        // Our All Conditions
        if (computerChoice == playerChoice) {
            System.out.println("Your Match is Draw!\n");
        }
        else if (playerChoice==0 && computerChoice==2 || playerChoice==1 && computerChoice==0 ||
                playerChoice==2 && computerChoice==1) {
            System.out.println("Congratulations, You Win the Match!\n");
        }
        else {
            System.out.println("Sorry, You Lost the Match! Please Try Again.\n");
        }
        System.out.println("Thank you, for Playing This Game!");
        sc.close();
    }
}
