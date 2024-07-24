import java.util.Scanner;

public class mulOfBinary {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String b1=sc.nextLine();
        String b2= sc.nextLine();
        int n1=Integer.parseInt(b1);
        int n2= Integer.parseInt(b2);
        int mul=n1*n2;
        String multi=Integer.toBinaryString(mul);
        System.out.println(multi);
    }
}
