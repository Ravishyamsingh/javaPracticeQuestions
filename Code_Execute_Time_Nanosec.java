






import java.lang.*;

public class Code_Execute_Time_Nanosec {
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        // Create a Scanner object for user input// Create a Scanner object for user input
        // Create a Scanner object for user input
        // Sample program: Display the first 10 natural numbers.
        int i;
        System.out.println("The first 10 natural numbers are:\n");
        for (i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Calculate the elapsed time in nanoseconds.
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("Estimated time (in nanoseconds) to get the first 10 natural numbers: " + estimatedTime);
    }
}

