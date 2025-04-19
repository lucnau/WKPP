package src.UE1;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int numberToGuess = (int) (Math.random() * 20) + 1;
        Scanner scanner = new Scanner(System.in);
        boolean hasGuessedCorrectly = false;

        while (!hasGuessedCorrectly) {
            System.out.print("Guess a number between 1 and 20: ");
            int userGuess = scanner.nextInt();

            if (userGuess < 1 || userGuess > 20) {
                System.out.println("Please guess a number between 1 and 20.");
            } else if (userGuess < numberToGuess) {
                System.out.println("Your guess is too low. Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Your guess is too high. Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the correct number: " + numberToGuess);
                hasGuessedCorrectly = true;
            }
        }
    }
}