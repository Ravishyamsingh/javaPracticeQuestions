import java.util.Scanner;

public class comTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1=sc.nextInt();
        System.out.println("Enter second number: ");
        int n2=sc.nextInt();
        if(n1==n2){
            System.out.println("Both number are equal!");
        } else if (n1>n2) {
            System.out.println("Number 1 is greater!");

        }else {
            System.out.println("Number 2 is greater!");
        }
    }
}
