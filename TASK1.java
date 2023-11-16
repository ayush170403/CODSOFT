import java.util.Random;
import java.util.Scanner;

public class TASK1 {

    public static void main(String[] args) {
        playGame();
    }

    public static void playGame() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int lowerRange = 1;
        int upperRange = 100;
        int numberToGuess = random.nextInt(upperRange - lowerRange + 1) + lowerRange;
        int maxAttempts = 10;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game! Guess the number between " + lowerRange + " and "
                + upperRange + ".");

        while (attempts < maxAttempts) {
            System.out.print("Attempt " + (attempts + 1) + ": Enter your guess: ");
            try {
                int userGuess = sc.nextInt();

                if (userGuess < lowerRange || userGuess > upperRange) {
                    System.out.println("Please enter a number between " + lowerRange + " and " + upperRange + ".");
                } else if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the correct number " + numberToGuess + " in "
                            + (attempts + 1) + " attempts.");
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }

                attempts++;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Please enter a valid number.");
                sc.next(); // Clear the input buffer
            }
        }

        if (attempts == maxAttempts) {
            System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was "
                    + numberToGuess + ".");
        }

        System.out.print("Do you want to play again? (yes/no): ");
        String playAgain = sc.next().toLowerCase();

        if (playAgain.equals("yes")) {
            playGame();
        } else {
            System.out.println("Game Over!");
        }
    }
}