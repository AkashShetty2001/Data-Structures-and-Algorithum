package basics.loops;

public class BreakStatement {
    public static void main(String[] args) {
        // Loop from 1 to 5
        for(int i = 1; i <= 5; i++) {
            // If i equals 3, break out of the loop
            if(i == 3) {
                break;  // Exits the loop when i is 3
            }
            // Print the value of i for each iteration
            System.out.println(i);
        }

        // This will be printed after the loop ends (due to the break)
        System.out.println("I am out of the loop.");

        // ---------------------------------------------
        // Concept Summary:
        // 1. The 'break' statement is used to exit a loop prematurely.
        // 2. When the 'break' statement is executed, the loop stops immediately and control moves to the next statement after the loop.
        // 3. In this example, the loop runs from 1 to 5, but when i equals 3, the 'break' statement is triggered and exits the loop.
        // 4. The program then prints "I am out of the loop." after the loop has ended.
        // 5. The 'break' statement only exits the **innermost** loop. In the case of nested loops, the outer loops will continue executing.
        // 6. The 'break' is useful when you want to stop a loop early based on some condition, like finding a specific item in a collection.
        // ---------------------------------------------
    }
}
