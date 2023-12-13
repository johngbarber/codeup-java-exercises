import java.util.Random;
import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100)+1;
        int userGuess = 0;

        System.out.println("Please guess a number between 1 and 100:");

        while (userGuess != numberToGuess){
            while (!scanner.hasNextInt()){
                System.out.println("That is not a number. Please enter a valid number:");
                scanner.next();
            }

            userGuess= scanner.nextInt();

            if (userGuess < 1 || userGuess > 100){
                System.out.println("Please enter a number between 1 and 100:");
                continue;
            }
            if (userGuess < numberToGuess) {
                System.out.println("HIGHER");
            } else if (userGuess > numberToGuess) {
                System.out.println("LOWER");
            } else {
                System.out.println("GOOD GUESS");
            }
        }
    }
}
