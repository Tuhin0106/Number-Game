import java.util.Random;
import java.util.Scanner;
public class NumberGame{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int lowerBound = 1;
        int upperBound = 100;
        int maxAttempts = 5;
        int score = 0;
        boolean playAgain = true;
        System.out.println("Welcome to the Number Guessing Game!");
        while (playAgain) {
            int generatedNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int attempts = 0;
            boolean guessedCorrectly = false;
            System.out.println("I've generated a number between " + lowerBound + " and " + upperBound + ".");
            System.out.println("You have 5 attempts to choose from - ");
            while (!guessedCorrectly && attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;
                if (userGuess == generatedNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    score++;
                    guessedCorrectly = true;
                } else if (userGuess < generatedNumber) {
                    System.out.println("Your guess is too low. Try again.");
                } else {
                    System.out.println("Your guess is too high. Try again.");
                }
            }
            if (!guessedCorrectly) {
                System.out.println("Oops!!!!!!!!!.......................\nSorry, you've reached the maximum number of attempts.\nThe correct number was: " + generatedNumber);
            }
            System.out.println("Your current score: " + score);
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next();
            playAgain = playAgainInput.equalsIgnoreCase("yes");
        }
        System.out.println("Thank you for playing the Number Guessing Game!");
        scanner.close();
    }
}
