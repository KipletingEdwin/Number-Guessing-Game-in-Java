import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = rand.nextInt(100) + 1;
//        System.out.println("Random number is: "+randomNumber);

        while (true){
            System.out.println("Enter your guess(1-100):");
            int playerGuess = scanner.nextInt();

            if(playerGuess == randomNumber){
                System.out.println("Correct, genius");
            } else if (playerGuess>randomNumber) {
                System.out.println("It is higher than the actual number");
            }
            else {
                System.out.println("It is lower than the actual number");
            }
        }
    }
}
