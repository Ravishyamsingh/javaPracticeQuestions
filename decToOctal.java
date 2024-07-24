import java.util.Scanner;

public class decToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Decimal Number: ");
        int dec = sc.nextInt();
        String oct = Integer.toOctalString(dec);
        System.out.println(oct.toUpperCase());
    }
}