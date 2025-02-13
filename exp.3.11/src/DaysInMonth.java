import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take user input for month and year
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        
        // Validate month input
        if (month < 1 || month > 12) {
            System.out.println("Invalid month.");
        } else {
            // Number of days in each month, with February being handled separately
            int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            if (month == 2 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
                daysInMonths[1] = 29; // Leap year correction for February
            }
            
            // Output the result
            System.out.printf("Month %d of year %d has %d days.%n", month, year, daysInMonths[month - 1]);
        }
        
        scanner.close();
    }
}