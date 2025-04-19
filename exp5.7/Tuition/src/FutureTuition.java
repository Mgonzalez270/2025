public class FutureTuition {

    public static void main(String[] args) {
        double currentTuition = 10000;
        double annualIncreaseRate = 0.05; // 5%

        // Calculate tuition in ten years
        double tuitionInTenYears = currentTuition;
        for (int year = 1; year <= 10; year++) {
            tuitionInTenYears *= (1 + annualIncreaseRate);
        }

        System.out.printf("Tuition in ten years: $%.2f%n", tuitionInTenYears);

        // Calculate the total cost of four years' worth of tuition after the tenth year
        double totalCostAfterTenYears = 0;
        double tuitionAfterTenYears = tuitionInTenYears;

        for (int year = 1; year <= 4; year++) {
            totalCostAfterTenYears += tuitionAfterTenYears;
            tuitionAfterTenYears *= (1 + annualIncreaseRate); // Tuition increases each year
        }

        System.out.printf("Total cost of four years' tuition after the tenth year: $%.2f%n", totalCostAfterTenYears);
    }
}