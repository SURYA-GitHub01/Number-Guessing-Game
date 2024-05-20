import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Guess Number Game");
        System.out.println("You Will Be Asked To Guess A Number To Win The Game");
        System.out.println("You have Maximum 5 Attempt Limit");

        int Number = 62;

        int i = 1;
        while (i <= 5) {


            System.out.println("Enter a guess number between 1 to 100");
            int GuessNumber = input.nextInt();

            if (GuessNumber < 62) {
                System.out.println("Your Guess Number is Smaller.");
            }
            else if (GuessNumber > 62) {
                System.out.println("Your Guess Number is Greater.");
            }
            else if (GuessNumber == 62) {
                System.out.println("OOhhOO!,Your Number is Correct. You Win the Game!");
            }

            if(i==5) {
                if (GuessNumber != 62) {
                    System.out.println("Sorry!,Your Number is Incorrect. You Loss the Game!");
                }
            }
            System.out.println();

            i++;
        }
    }
}