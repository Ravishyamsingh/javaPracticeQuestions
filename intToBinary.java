import java.util.Scanner;

public class intToBinary {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        String s1= Integer.toBinaryString(n1);
        System.out.println(s1);

    }
}
