package basics.conditional_Statements;

public class IfElseBlock {
    public static void main(String[] args) {
        /*
         * The if-else block allows us to execute different blocks of code based on a condition.
         * The condition is evaluated as either true or false:
         * - If the condition is true, the code inside the 'if' block will execute.
         * - If the condition is false, the code inside the 'else' block will execute.
         */

        // Declare and initialize the variable 'age'
        int age = 18;

        // Check if the age is greater than or equal to 18
        if (age >= 18) {
            // If the condition is true, print that the person is an adult
            System.out.println("You are an adult");
        } else {
            // If the condition is false, print that the person is not an adult
            System.out.println("You are not an adult");
        }

        // Summary of the if-else statement:
        // - The condition 'age >= 18' is checked.
        // - If true, the message "You are an adult" is printed.
        // - If false, the message "You are not an adult" is printed.
    }
}
