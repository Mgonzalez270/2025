public class MilesToKilometers {

    public static void main(String[] args) {
        final double KILOMETERS_PER_MILE = 1.609;

        // Display the table header
        System.out.println("Miles   Kilometers");
        System.out.println("--------------------");

        // Loop to generate and display the conversions from 1 to 10 miles
        for (int miles = 1; miles <= 10; miles++) {
            double kilometers = miles * KILOMETERS_PER_MILE;
            System.out.printf("%-5d   %-8.3f%n", miles, kilometers);
        }
    }
}