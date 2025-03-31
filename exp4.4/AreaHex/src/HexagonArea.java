import java.util.Scanner;

public class HexagonArea {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the side of the hexagon
        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        // Calculate the area of the hexagon using the formula
        double area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 6));

        // Display the area of the hexagon
        System.out.printf("The area of the hexagon is %.2f%n", area);

        input.close();
    }
}