import java.util.Scanner;

public class DepreciationCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial value: ");
        double initialValue = scanner.nextDouble();

        System.out.print("Enter depreciation rate (in %): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter number of years: ");
        int years = scanner.nextInt();

        double depreciatedValue = initialValue * Math.pow((1 - rate / 100), years);

        System.out.println("Depreciated Value: " + depreciatedValue);

        scanner.close();
    }
}
