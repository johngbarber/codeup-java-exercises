import java.util.Scanner;

public class AmateurCodingChallenges {

//  Write a function that returns the SUM of a sequence of numbers. This sequence is determined by three variables: start, finish, and step. The sequence begins at start, ends at finish, and goes up by step until it reaches finish or a number that when increased by step would go past finish.

public static int sumStep (int start, int finish, int step){
    int sum = start;
    int i;
    for (i = start; i <= finish; i += step);
    {
        sum += i;
    }
    return sum;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter start value: ");
        int start = scanner.nextInt();

        System.out.print("Enter finish value: ");
        int finish = scanner.nextInt();

        System.out.print("Enter step value: ");
        int step = scanner.nextInt();

        int result = sumStep(start, finish, step);
        System.out.println("Sum of sequence: " + result);

        scanner.close();
    }
}
