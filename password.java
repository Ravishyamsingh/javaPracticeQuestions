import java.io.Console;
public class password {
    public static void main(String[] args) {
        Console cons;
        // Check if the system console is available.
        if ((cons = System.console()) != null) {
            // Declare a character array 'pass_ward' to store the password.
            char[] pass_ward = null;
            try {
                // Prompt the user to input their password.
                pass_ward = cons.readPassword("Input your Password:");
                // Display the password to the console.
                System.out.println("Your password was: " + new String(pass_ward));
            } finally {
                if (pass_ward != null) {
                    java.util.Arrays.fill(pass_ward, ' ');
                }
            }
        } else {
            // If the system console is not available, throw a runtime exception.
            throw new RuntimeException("Can't get the password... No console");
        }
    }
}