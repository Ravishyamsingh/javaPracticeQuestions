import java.lang.Math;
import java.util.Scanner;

public class area {
    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);
        double pi = 3.14;
        System.out.println("Enter the radius");
        int radius = sc.nextInt();
        double area = pi* radius* radius;
        System.out.println(area);
        System.out.println(2*pi*radius);
    }
}
