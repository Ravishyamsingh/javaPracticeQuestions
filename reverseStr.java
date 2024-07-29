import java.util.Scanner;

public class reverseStr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");

        String name = sc.nextLine();

        String reversedString = new StringBuilder(name).reverse().toString();

        System.out.println(reversedString);
        
    }
}
