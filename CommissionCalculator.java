import java.util.Scanner;

public class CommissionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total sales: ");
        double sales = scanner.nextDouble();

        System.out.print("Enter commission amount: ");
        double commission = scanner.nextDouble();

        double commissionPercentage = (commission / sales) * 100;

        System.out.println("Commission Percentage: " + commissionPercentage + "%");

        scanner.close();
    }
}
