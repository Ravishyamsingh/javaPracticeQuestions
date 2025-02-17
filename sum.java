import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner sumNum=new Scanner(System.in);
        int num1=sumNum.nextInt();
        int num2=sumNum.nextInt();
        int sumN=num1+num2;
        System.out.println("Sum is ="+sumN);
    }
}
