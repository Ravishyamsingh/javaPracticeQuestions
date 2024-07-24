import java.util.Scanner;

public class binaryToints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.nextLine();
        int num = Integer.parseInt(binary, 2);
        System.out.println(num);
    }
}