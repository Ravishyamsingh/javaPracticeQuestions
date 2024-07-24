import java.util.Scanner;

public class addBinary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Binary Number: ");
        String s1=sc.next();
        System.out.println("Enter second Binary Number: ");
        String s2 = sc.next();
        int n1=Integer.parseInt(s1,2);
        int n2=Integer.parseInt(s2,2);
        int sum= n1+n2;
        String Sum = Integer.toBinaryString(sum);
        System.out.println("Sum of the binary Number:"+Sum);

        System.out.println("=======================================");
        int sub=n1-n2;
        String Sub= Integer.toBinaryString(sub);
        System.out.println("Subtraction of the binary number:"+Sub);

        System.out.println("=======================================");
        int div=n1-n2;
        String Div= Integer.toBinaryString(div);
        System.out.println(" Division of the binary number:"+Div);


    }
}
