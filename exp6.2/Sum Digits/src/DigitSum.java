import java.util.Scanner;

public class DigitSum {

    // Method that computes the sum of digits in a long integer
    public static int sumDigits(long n) {
        int sum = 0;

        // Convert negative to positive
        n = Math.abs(n);

        while (n != 0) {
            sum += n % 10;   // Get the last digit
            n = n / 10;      // Remove the last digit
        }

        return sum;
    }

    // Main method to test sumDigits repeatedly
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter an integer: ");
            long number = input.nextLong();

            int result = sumDigits(number);
            System.out.println("The sum of the digits is: " + result);

            // Ask if the user wants to continue
            System.out.print("Would you like to enter another number? (y/n): ");
            choice = input.next().toLowerCase().charAt(0);

        } while (choice == 'y');

        System.out.println("Thanks for using the program!");
        input.close();
    }
}
