import java.sql.SQLOutput;
import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        double radius,Area;
        System.out.println("Enter the radius: ");
        radius=in.nextDouble();
        Area=2*3.14*radius;
        System.out.println(Area);
    }
}
