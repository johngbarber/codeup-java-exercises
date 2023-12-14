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

    public static long getPower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent == 1) {
            return base;
        } else if (exponent == 2) {
            return base * base;
        }
        return base * getPower(base, exponent - 1);
    }

    public static void count(int n) {
        if (n <= 0) {
            System.out.println("All done!");
            return;
        }
        System.out.println(n);
        count(n - 1);
    }

    public static void iSpy(String objectToFind, String hint){
        System.out.println("Player");
    }

    public static void main(String[] args) {
        int y = 125;
        String x = "hello" + y;
        System.out.println(x);
    }
}
