import java.util.Scanner;

// adding commments
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci terms you want: ");
        int n = input.nextInt();

        int firstTerm = 0;
        int secondTerm = 1;

        System.out.print("Fibonacci Sequence: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm);
            if (i < n) {
                System.out.print(", ");
            }

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        System.out.println("\nThe " + n + "th Fibonacci term is: " + firstTerm);

        input.close();
    }
}