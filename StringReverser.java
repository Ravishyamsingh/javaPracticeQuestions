public class StringReverser {

    // Method to reverse a given string
    public static String reverseStr(String str){
        int i;
        int  len=str.length();
        StringBuilder sc=new StringBuilder(len);
        for(i=(len-1);i>=0;i--){
            sc.append(str.charAt(i));
        }
        return sc.toString();
    }

    // Main method to test the reverseIt method
    public static void main(String[] args) {
        // Original string to be reversed
        String str="Hello";
        String reversed=reverseStr(str);
        System.out.println(reversed);
    }
}
