package basics.conditional_Statements;

public class ElseIfBlock {
    public static void main(String[] args) {
        /*
         * The if-else (else if) block is used when there are multiple conditions to check.
         * The program checks each condition in sequence:
         * - If the first 'if' condition is true, the corresponding block of code will execute.
         * - If the first condition is false, the program checks the next 'else if' condition.
         * - If all conditions are false, the 'else' block is executed.
         */

        // Declare and initialize the variable 'age'
        int age = 12;

        // Check if the age is greater than or equal to 18
        if (age >= 18) {
            // If true, print "adult"
            System.out.println("adult");
        }
        // Check if the age is between 13 and 17 (teenager)
        else if (age >= 13 && age < 18) {
            // If true, print "teenager"
            System.out.println("teenager");
        }
        // If none of the above conditions are true (i.e., age is less than 13)
        else {
            // Print "child"
            System.out.println("child");
        }

        // Summary of the else-if statement:
        // - The program first checks if age is 18 or older (adult).
        // - If not, it checks if age is between 13 and 17 (teenager).
        // - If neither of the above conditions is true, it considers the person a child (under 13).
    }
}
