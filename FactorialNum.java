import java.util.Scanner;

//public class FactorialNum {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number: ");
//        int num=sc.nextInt();
//        Fact(num);
//
//
//    }
//    static void Fact(int num){
//        int fact=1;
//        for(int i=1;i<=num;i++){
//            fact*=i;
//            System.out.println(fact);
//
//        }
//        System.out.println(fact);
//    }
//}
public class FactorialNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        Fact(num);
        sc.close();


    }
    static void Fact(int num){
        if (num<0){
            System.out.println("factorial is not define for negative number!");
            return;
        }
        int fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;

        }
        System.out.println(fact);

    }
}
