

import java.util.*;


import java.util.*;
public class AreaOfRectangle {
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        double length,width,Arearectangle;
        System.out.println("Enter the Length:");
        length=in.nextDouble();
        System.out.println("Enter the Width: ");
        width=in.nextDouble();
        // Check if the subpart length is greater than the string length
        Arearectangle=length*width;
        System.out.println("Area of rectangle:"+Arearectangle);
    }
}
