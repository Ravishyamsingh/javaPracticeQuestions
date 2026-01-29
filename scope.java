public class scope {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        {
            //int a=20;  already initialised outside the in the same method, you cannot initialised again
            int c=30;
            a=100; //reasign the original reference value with some other value
            System.out.println(a);
        }
        //System.out.println(c);  you can not access this code outside the blocks
        System.out.println(a);
        for (int i=1;i<5;i++){
            int num=10;
            a=10000;
            System.out.println(i);

        }
        System.out.println(a);


    }
    static void marks(int random){
        int num=10;
        System.out.println(num);
        System.out.println(random);

    }
}
