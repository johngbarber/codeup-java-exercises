import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {
    public static long addition(long addOne, long addTwo) {
        return addOne + addTwo;
    }

    public static long subtraction(long subOne, long subTwo){
        return subOne - subTwo;
    }

    public static long multiplication(long multOne, long multTwo){
        return multOne * multTwo;
    }

    public static double division(double divOne, double divTwo){
        if (divTwo == 0){
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        return divOne / divTwo;
    }

    public static long modulus(long modOne, long modTwo){
        if (modTwo == 0){
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        return modOne % modTwo;
    }

    public static long factorial(){
        Scanner scanner = new Scanner(System.in);
        int factorialInput;
        do {
            System.out.print("Please enter a valid integer between 1 and 10: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Read and discard the invalid input
            }
            factorialInput = scanner.nextInt();
        } while (factorialInput < 1 || factorialInput > 10);

        long result = 1;
        for (int i = 1; i <= factorialInput; i++) {
            result *= i;
        }


        return result;
    }

    public static int rollDice(int sides){
        return (int)(Math.random()*sides)+1;
    }

    public static void DiceRoller(){
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Please enter the number of sides on your dice:");
        int numberOfSides = scanner2.nextInt();
        while (numberOfSides <=0){
            System.out.println("Please enter a valide number of sides (greater than 0):");
            numberOfSides = scanner2.nextInt();
        }

        int roll1 = rollDice(numberOfSides);
        int roll2 = rollDice(numberOfSides);

        System.out.println("You rolled: " + roll1 + " and " + roll2);
    }

    public static void main(String[] args) {
//        System.out.println(division(4,2));
//        System.out.println(modulus(5,2));
//        System.out.println(addition(4,2));
//        System.out.println(subtraction(5,1));
//        System.out.println(multiplication(25,26));
//        System.out.println("Factorial is: " + factorial());
        DiceRoller();
    }
}
