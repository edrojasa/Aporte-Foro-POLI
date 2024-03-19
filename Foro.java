import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting user for input
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Checking if the number is a multiple of 100
        if (number % 100 == 0) {
            System.out.println("multiple of 100.");
        } else {
            System.out.println("not multiple of 100.");
        }

        scanner.close(); // Closing scanner
    }
}
