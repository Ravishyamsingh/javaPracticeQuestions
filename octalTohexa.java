import java.util.Scanner;

public class octalTohexa {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Octal Number: ");
        String s1=sc.nextLine();
        int dec=Integer.parseInt(s1,8);
        String hexa=Integer.toHexString(dec);
        System.out.println(hexa);
    }
}
