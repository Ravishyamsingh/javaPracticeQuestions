//import java.util.Scanner;
//
//public class Fibonacci {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int num=in.nextInt();
//        int n1=0;
//        int n2=1;
//        for (int i=2;i<=num;i++){
//            int temp=n2;
//            n2=n2+n1;
//            n1=temp;
//            //System.out.println(n2);
//        }
//        System.out.println(n1);
//    }
//}
//
//
//
////    int a = 0;
////    int b = 1;
////    int count = 2;
////
////        while (count <=n) {
////                int temp = b;
////                b = b+a;
////                a = temp;
////                count++;



import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.close(); // Close scanner to avoid resource leak

        if (num < 0) {
            System.out.println("Invalid input! Enter a non-negative number.");
            return;
        }

        int n1 = 0, n2 = 1;

        if (num == 0) {
            System.out.println(n1);
        } else if (num == 1) {
            System.out.println(n2);
        } else {
            for (int i = 1; i < num; i++) {
                int temp = n2;
                n2 = n2 + n1;
                n1 = temp;
                System.out.println(n2);
            }
            //System.out.println(n2);
        }
    }
}
