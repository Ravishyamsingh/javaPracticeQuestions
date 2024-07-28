import java.math.BigInteger;
import java.util.Scanner;

public class hexaTobinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Hexa Number: ");
        String s1 = sc.nextLine();
        String n1 = new BigInteger(s1, 16).toString(2);
//        String dec=Integer.toBinaryString(n1);
        System.out.println(n1);

    }
}
