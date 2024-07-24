import java.util.Scanner;

public class DecimalToHexa {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Decimal Number: ");
        int dec= sc.nextInt();
        String hexa= Integer.toHexString(dec);
        System.out.println(hexa.toUpperCase());
    }
}
