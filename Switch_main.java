

import java.util.Scanner;

public class Switch_main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.print("Enter fruit name: ");
//        String fruit= in.next();

//        if ( fruit.equals("mango")){
//            System.out.println("king of fruit ");
//        }
//
//        if (fruit.equals("apple")){
//            System.out.println("A sweet red fruit");
//        }

        //Switch case:
        //if breaks is not provided then it will execute all cases
//        switch (fruit) {
//            case "mango":
//                System.out.println("King of fruit");
//                break;
//            case "Apple":
//                System.out.println("A sweet red fruit");
//                break;
//            case "Orange":
//                System.out.println("Round fruit");
//                break;
//            case "Grapes":
//                System.out.println("Small fruit");
//                break;
//            default:
//                System.out.println("Please enter a valid fruit ");
//                break;
//        }
        int day = in.nextInt();
        switch (day) {
            case 1:
                int a = 5;
                int b = 6;
                int c = a + b;
                System.out.println(c);
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Here is break");
                break;
            case 5:
            case 6:
            case 7:
                System.out.println("This is second break");
                break;
            case 8:
        }
//        switch (day) {
//            case 1, 2, 3, 4 -> System.out.println("Here is break");
//            case 5, 6, 7 -> System.out.println("This is second break");
//            case 8 -> {
//            }
//        }

    }

}
