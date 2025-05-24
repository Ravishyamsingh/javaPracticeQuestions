import java.util.Scanner;

public class Add_subtract_digit {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        
        
// Check if the subpart length is greater than the string length
        
        int product = 1, sum = 0;
        while (n > 0) {
            int digit = n % 10;
            product *= digit;
            sum += digit;
            n /= 10;
        }

        System.out.println("Result: " + (product - sum));
    }
}
