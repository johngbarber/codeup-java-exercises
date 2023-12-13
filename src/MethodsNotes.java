import java.util.Scanner;

public class MethodsNotes {

    public static String birthday() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();

        // Consume the leftover newline character
        scanner.nextLine();

        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();

        String birth = "Hello " + name + ", you are " + age + " years old.";
        return birth;
    }

    public static void changeString(String s) {
        s = "Wub a lub a dub dub";
    }



    public static void main(String[] args) {
        System.out.println(birthday());
    }
}
