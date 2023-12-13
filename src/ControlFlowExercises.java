import java.util.Arrays;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        int i = 5;
//        while (i <= 15){
//            System.out.println(i);
//            i++;

//        int i = 0;
//        do{
//            System.out.println(i);
//            i += 2;
//        } while (i <= 100);

//        int i = 100;
//        do{
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);

//        long i = 2;
//        do{
//            System.out.println(i);
//            i *= i;
//        } while (i < 1000000);

//        for (int i = 5; i <= 15; i++) {
//            System.out.println("Value of i: " + i);
//        }

//        for (int i = 0; i <= 100; i += 2) {
//            System.out.println(i);
//        }

//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }

//        for (int i = 1; i <= 100; i++) {
//            if (((i % 3) == 0) && ((i % 5) == 0)) {
//                System.out.println("FizzBuzz");
//            } else if ((i % 3) == 0) {
//                System.out.println("Fizz");
//            } else if ((i % 5) == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

//        Scanner scanner = new Scanner(System.in);
//        do{
//            System.out.println("Enter an integer: ");
//            int inputValue = scanner.nextInt();
//
//            System.out.println("Here is your table!");
//            System.out.printf("%-10s%-10s%-10s%n", "Number", "Squared", "Cubed");
//
//            for (int i = 1; i <= inputValue; i++){
//                int square = i*i;
//                int cube = i * i * i;
//                System.out.printf("%-10d%-10d%-10d%n", i , square, cube);
//            }
//            System.out.println("Do you want to continue? (y/n): ");
//            String response;
//            response = scanner.next().toLowerCase();
//        } while (scanner.next().toLowerCase().equals("y") );
//        scanner.close();

        Scanner scanner = new Scanner(System.in);
        String choice = "y";

        while (choice.equalsIgnoreCase("y")) {
            int numericalGrade;

            // Input validation loop
            do {
                System.out.print("Please enter an integer between 0 - 100: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Invalid input. Please enter a valid integer.");
                    scanner.next();
                }
                numericalGrade = scanner.nextInt();
            } while (numericalGrade < 0 || numericalGrade > 100);

            // Convert numerical grade to letter grade
            char letterGrade;
            if (numericalGrade >= 88 && numericalGrade <= 100) {
                letterGrade = 'A';
            } else if (numericalGrade >= 80 && numericalGrade <= 87) {
                letterGrade = 'B';
            } else if (numericalGrade >= 67 && numericalGrade <= 79) {
                letterGrade = 'C';
            } else if (numericalGrade >= 60 && numericalGrade <= 66) {
                letterGrade = 'D';
            } else {
                letterGrade = 'F';
            }

            System.out.println("Letter Grade: " + letterGrade);

            System.out.print("Continue? (y/n): ");
            choice = scanner.next();
        }

        scanner.close();
    }
}
