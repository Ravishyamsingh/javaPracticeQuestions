import java.util.Scanner;

public class distearthsurface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius=6371.01;
        System.out.println("Input the latitude of coordinate: ");
        double x1 = sc.nextDouble();
        System.out.println("Input the longitude of coordinate: ");
        double y1 = sc.nextDouble();
        System.out.println("Input the latitude of coordinate: ");
        double x2 = sc.nextDouble();
        System.out.println("Input the longitude of coordinate: ");
        double y2 = sc.nextInt();
        x1 = Math.toRadians(x1);
        x2 = Math.toRadians(x2);
        y1 = Math.toRadians(y1);
        y2 = Math.toRadians(y2);

       // d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))

        double earthrad=radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
        System.out.println(earthrad);

    }
}
