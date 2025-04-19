import java.util.Scanner;

public class EliminateDuplicates {

    // Method to eliminate duplicate integers
    public static int[] eliminateDuplicates(int[] list) {
        int[] temp = new int[list.length];  // To store distinct elements
        int count = 0;

        for (int i = 0; i < list.length; i++) {
            boolean isDuplicate = false;

            // Check if list[i] is already in temp
            for (int j = 0; j < count; j++) {
                if (list[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If not duplicate, add to temp
            if (!isDuplicate) {
                temp[count] = list[i];
                count++;
            }
        }

        // Create a new array with the exact size of distinct elements
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    // Main method to test eliminateDuplicates
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }

        int[] distinct = eliminateDuplicates(numbers);

        System.out.print("The distinct numbers are: ");
        for (int num : distinct) {
            System.out.print(num + " ");
        }

        input.close();
    }
}