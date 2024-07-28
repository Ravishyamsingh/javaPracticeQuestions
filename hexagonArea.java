import java.util.Scanner;

import static java.lang.Math.pow;

public class hexagonArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side: ");
        double side=sc.nextInt();
        double area=((6*side*side)/(4*Math.tan(Math.PI/6)));
        System.out.println("Area of the hexagon is : "+  area);
    }
}
