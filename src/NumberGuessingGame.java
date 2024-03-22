import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = rand.nextInt(100) + 1;
//        System.out.println("Random number is: "+randomNumber);

        int tryCount = 0;
        while (true) {
            System.out.println("Enter your guess(1-100):");
            int playerGuess = scanner.nextInt();
            tryCount++;

            if (playerGuess == randomNumber) {
                System.out.println("Correct, genius");
                System.out.println("It took you " + tryCount + " times to win");
                break; // Exit the loop when the correct guess is made
            } else if (playerGuess > randomNumber) {
                System.out.println("It is higher than the actual number");
            } else {
                System.out.println("It is lower than the actual number");
            }
        }
        scanner.close();
    }
}
