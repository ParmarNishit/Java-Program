import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int i, fact = 1;
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int number = scanner.nextInt();
        int number = 5;

        for (i = 1; i <= number; i++) {
            fact = i * fact;
        }
        System.out.println("Factorial is " + fact);

        // scanner.close();
    }
}