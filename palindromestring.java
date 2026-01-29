package Array_ArrayList;

public class palindromestring {
    public static void main(String[] args) {
        String str="madam";
        String rev="";

        for(int i=0;i<=str.length()-1;i++){
            rev=str.charAt(i)+rev;

        }
        if(rev.equals(str)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrom");
        }
    }
}
