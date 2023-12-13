import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("What do you have to say to Bob?");
            String userInput = scanner.nextLine().trim();

            if (userInput.isEmpty()){
                System.out.println("Bob: Fine. Be that way!");
            } else if (userInput.endsWith("?")) {
                System.out.println("Bob: Sure.");
            } else if (userInput.endsWith("!")) {
                System.out.println("Bob: Whoa, chill out!");
            }else {
                System.out.println("Bob: Whatever.");
            }
            System.out.println("Do you want to continue talking to Bob? (y/n)");
            String response = scanner.nextLine().toLowerCase();

            if (!response.equals("y")){
                System.out.println("Bob: Goodbye!");
                break;
            }
        }
    }
}
