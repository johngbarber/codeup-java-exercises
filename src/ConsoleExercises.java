import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f%n", pi);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int userInt = scanner.nextInt();

        System.out.println("Please enter three words: ");
        String userInput1 = scanner.next();
        String userInput2 = scanner.next();
        String userInput3 = scanner.next();
        System.out.printf("%s%n%s%n%s%n", userInput1, userInput2, userInput3);

        System.out.println("Please enter a sentence: ");
        String userInput4 = scanner.next();

        System.out.println("Please enter a sentence: ");
        String userInput5 = scanner.nextLine();
        System.out.println(userInput5);

        System.out.println("Enter the length of the classroom: ");
        String lengthInput = scanner.nextLine();

        System.out.println("Enter the width of the classroom: ");
        String widthInput = scanner.nextLine();

        System.out.println("Enter the height of the classroom: ");
        String heightInput = scanner.nextLine();

        double length = Double.parseDouble(lengthInput);
        double width = Double.parseDouble(widthInput);
        double height = Double.parseDouble(heightInput);

        double area = length * width;
        double perimeter = 2 * (length + width);
        double volume = width * length * height;

        System.out.println("Area of the classroom: " + area);
        System.out.println("Perimeter of the classroom: " + perimeter);
        System.out.println("Volume of the classroom: " + volume);
        }

}
