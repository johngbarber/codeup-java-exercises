import java.util.Scanner;


public class ConsoleIO {
    public static void main(String[] args) {
//        System.out.print("hello");
//        System.out.print("world");
        String name = "codeup";
        System.out.printf("Hello there, %s. Nice to see you.%n", name);

        String greeting = "Salutations";

        System.out.printf("%s, %s!", greeting, name);

//        Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter something: ");
        String userInput = scanner.nextLine();

        System.out.println("You entered --> \"" + userInput + "\" <--");
    }
}
