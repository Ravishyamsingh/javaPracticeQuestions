import java.util.Scanner;

class PrintValue {

    // Function to print the word for the corresponding digit
    static void printWord(String N) {
        // Array to store words for digits 0-9
        String[] words = { "Zero", "One", "Two", "Three", "Four", "Five",
                "Six", "Seven", "Eight", "Nine" };

        // Iterate through each character in the string
        for (char digit : N.toCharArray()) {
            if (Character.isDigit(digit)) {
                // Print the word for the digit
                System.out.print(words[digit - '0'] + " ");
            } else {
                System.out.print("Invalid Input ");
            }
        }
        System.out.println();
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a number: ");
        String N = sc.nextLine();

        // Call the function to print words
        printWord(N);
    }
}
