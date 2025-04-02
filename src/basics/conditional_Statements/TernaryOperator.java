package basics.conditional_Statements;

public class TernaryOperator {
    public static void main(String[] args) {
        /*
         * The ternary operator is a shorthand way of writing an if-else statement.
         * It requires three operands:
         * - The condition to evaluate.
         * - The result if the condition is true (statement1).
         * - The result if the condition is false (statement2).
         * Syntax: variable = (condition) ? statement1 : statement2;
         */

        // Declare and initialize the variable 'number'
        int number = 47;

        // Check if the number is even or odd using the ternary operator
        // If the number is divisible by 2, it's even, otherwise it's odd
        String res = (number % 2 == 0) ? "even" : "odd";

        // Print the result (either "even" or "odd")
        System.out.println(res);

        // Summary of the ternary operator:
        // - The condition '(number % 2 == 0)' checks if the number is divisible by 2 (even).
        // - If true, the result is "even", otherwise the result is "odd".
        // - The ternary operator allows for concise conditional expressions.
    }
}
