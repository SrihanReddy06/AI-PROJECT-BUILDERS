import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Create a Random object to generate a random number
        Random random = new Random();

        // Generate a random number between 1 and 100
        int targetNumber = random.nextInt(100) + 1;

        // Variable to store the user's guess
        int guess = 0;

        // Counter for the number of attempts
        int attempts = 0;

        System.out.println("Welcome to Guess the Number!");
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("Try to guess it.");

        // Loop until the user guesses the correct number
        while (guess != targetNumber) {
            System.out.print("Enter your guess: ");

            // Read the user's input
            if (scanner.hasNextInt()) {
                guess = scanner.nextInt();
                attempts++;

                // Provide feedback
                if (guess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else if (guess > targetNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                }
            } else {
                // Handle non-integer input
                System.out.println("Please enter a valid integer.");
                scanner.next(); // discard invalid input
            }
        }

        // Close the scanner
        scanner.close();
    }
}