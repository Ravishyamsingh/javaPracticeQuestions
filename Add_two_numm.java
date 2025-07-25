

import java.util.*;
import java.util.Scanner;

public class Add_two_numm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        
        // Check if the subpart length is greater than the string length
        System.out.print("Enter second number: ");
        
        int b = sc.nextInt();
        sc.close();

        System.out.println("Sum: " + (a + b));
    }
}
