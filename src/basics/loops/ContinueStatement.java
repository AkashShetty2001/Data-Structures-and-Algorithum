package basics.loops;

public class ContinueStatement {
    public static void main(String[] args) {
        // Loop from 1 to 5
        for(int i = 1; i <= 5; i++) {
            // If i equals 3, skip the current iteration and move to the next one
            if(i == 3) {
                continue;  // Skips the rest of the loop for this iteration and proceeds to the next iteration
            }
            // Print the value of i for each iteration except when i is 3
            System.out.println(i);
        }

        // ---------------------------------------------
        // Concept Summary:
        // 1. The 'continue' statement is used to skip the current iteration of a loop and continue with the next iteration.
        // 2. In this example, when i equals 3, the 'continue' statement is triggered, skipping the rest of the loop body for i = 3.
        // 3. The program prints the numbers 1, 2, 4, and 5. The number 3 is skipped because of the 'continue' statement.
        // 4. The 'continue' statement only affects the current iteration and does not terminate the loop.
        // 5. The 'continue' statement is useful when you want to skip certain conditions or handle exceptions within the loop without completely breaking the loop.
        // ---------------------------------------------
    }
}
