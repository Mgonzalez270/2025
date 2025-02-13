import java.util.Scanner;

public class ComputeAndInterpretBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        // Prompt the user to enter feet
        System.out.print("Enter feet: ");
        int feet = input.nextInt();

        // Prompt the user to enter inches
        System.out.print("Enter inches: ");
        int inches = input.nextInt();

        // Convert height to meters
        double heightInInches = (feet * 12) + inches;
        double heightInMeters = heightInInches * 0.0254;

        // Compute BMI
        double bmi = weight * 0.45359237 / (heightInMeters * heightInMeters);

        // Display the BMI
        System.out.println("BMI is " + bmi);

        // Interpret the BMI
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");

        input.close(); // Close the scanner to release resources
    }
}