import java.util.Scanner;

public class PoorlyWrittenFibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of Fibonacci terms you want: ");
        int n = input.nextInt();

        int firstTerm = 0;
        int secondTerm = 1;
        System.out.print("Fibonacci Sequence: ");
        System.out.print(firstTerm + ", " + secondTerm + ", ");

        for (int i = 2; i <= n; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(nextTerm);
            if (i < n) {
                System.out.print(", ");
            }
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        System.out.println("The " + n + "th Fibonacci term is: " + secondTerm);
        input.close()
    }
}