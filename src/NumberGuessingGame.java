import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;

        System.out.println("Enter your guess(1-100):");
        Scanner scanner = new Scanner(System.in);
        int playerGuess = scanner.nextInt();

    }


}
