import java.util.Scanner;

public class ArrayAverage {

    public static int average(int[] array) {
        if (array == null || array.length == 0) {
            return 0; // Handle empty or null array
        }
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static double average(double[] array) {
        if (array == null || array.length == 0) {
            return 0.0; // Handle empty or null array
        }
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.println("Enter ten double values:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Value " + (i + 1) + ": ");
            numbers[i] = input.nextDouble();
        }

        double avg = average(numbers);
        System.out.println("The average value is: " + avg);

        input.close();
    }
}