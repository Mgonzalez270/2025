import java.util.Scanner;

public class SortThreeNumbers {

    // Method to display three numbers in increasing order
    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double temp;

        // Sort num1 and num2
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        // Sort num2 and num3
        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }

        // Sort num1 and num2 again to ensure complete order
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        // Display the sorted numbers
        System.out.println("The numbers in increasing order are: " + num1 + ", " + num2 + ", " + num3);
    }

    // Main method to test the sorting method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter three numbers
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = input.nextDouble();

        // Call the method to display numbers in order
        displaySortedNumbers(num1, num2, num3);

        input.close();
    }
}
