import java.util.Scanner;

public class hexaToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Hexa Number: ");
        String s1 = sc.nextLine();
        int n1 = Integer.parseInt(s1, 16);
        String dec=Integer.toOctalString(n1);
        System.out.println(dec);
    }
}
