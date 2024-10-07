import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if ((number & 1) == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        scanner.close();
    }
}