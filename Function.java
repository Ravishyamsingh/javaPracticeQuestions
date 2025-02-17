import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        //Q: Take a input of two number and print sum.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1 ");
        int num1=in.nextInt();
        System.out.println("Enter number 1 ");
        int num2=in.nextInt();
        int sum=num1+num2;
        System.out.println("The sum is "+sum);
    }
}
