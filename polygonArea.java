import java.util.Scanner;

public class polygonArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side: ");
        double side = sc.nextInt();
        System.out.println("Enter length of one sides: ");
        double num=sc.nextInt();

        //Area of a polygon = (n*s^2)/(4*tan(pi/n))

        double area = ((num*side*side) / (4 * Math.tan(Math.PI / num)));
        System.out.println("Area of the polygon is : " + area);

    }
}
