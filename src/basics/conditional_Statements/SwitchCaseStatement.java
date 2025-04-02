package basics.conditional_Statements;

public class SwitchCaseStatement {
    public static void main(String[] args) {
        /*
         * The switch-case statement is used when there are multiple possible values for a variable.
         * It is often used as an alternative to using multiple 'if-else' statements.
         * The syntax is as follows:
         * switch(variable){
         *     case value1:
         *         // code to execute if variable == value1
         *         break;
         *     case value2:
         *         // code to execute if variable == value2
         *         break;
         *     default:
         *         // code to execute if none of the cases match
         * }
         */

        // Declare and initialize the variable 'number'
        int number = 8;

        // Use switch-case to check the value of 'number' and execute corresponding code
        switch (number) {
            case 1:
                // If number is 1, print "samosa"
                System.out.println("samosa");
                break; // exit the switch-case block
            case 2:
                // If number is 2, print "burger"
                System.out.println("burger");
                break; // exit the switch-case block
            case 3:
                // If number is 3, print "mango shake"
                System.out.println("mango shake");
                break; // exit the switch-case block
            default:
                // If none of the cases match, print "nice dream!!!"
                System.out.println("nice dream!!!");
        }

        // Summary of the switch-case statement:
        // - The program checks the value of 'number' against each 'case'.
        // - If a match is found, the corresponding code block runs.
        // - The 'break' keyword ensures that once a match is found, the program exits the switch-case block.
        // - If no match is found, the 'default' block runs.
    }
}
