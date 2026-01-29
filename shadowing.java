public class shadowing {
    static int x=10;
    public static void main(String[] args) {
        System.out.println(x);
        int x=50;
        System.out.println(x);
//        int x;
//        System.out.println(x);// it will give error because before initialised we are going to acess the value
//        x=20;
        fun();

    }
    static void fun(){
        x=20;
        System.out.println(x);

    }
}

