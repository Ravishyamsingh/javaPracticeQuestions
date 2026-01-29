package Array_ArrayList;

public class checkoccurs {
    public static void main(String[] args) {
        String str="welcome to java with coder";
        int count=1;
        for(int i=0;i<=str.length()-1;i++){
            if((str.charAt(i) == ' ') && (str.charAt(i+1) !=' ')){
                count++;
            }
        }
        System.out.println(count);
    }
}
