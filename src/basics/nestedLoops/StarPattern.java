package basics.nestedLoops;

public class StarPattern {
    public static void main(String[] args) {

         /*

        print pattern

        *
        **
        ***
        ****

         */

        /* Prints a right-angled triangle of asterisks. */

        // Outer loop: Iterates through each line (4 lines).
        for (int line = 1; line <= 4; line++) {

            // Inner loop: Prints asterisks for the current line.
            // Number of asterisks equals the current line number.
            for (int j = 1; j <= line; j++) {
                System.out.print("*"); // Print a single asterisk.
            }

            System.out.println(); // Move to the next line after printing asterisks.
        }

        /*
         * Logic Summary:
         * This program uses nested loops to print a right-angled triangle
         * pattern of asterisks. The outer loop controls the number of rows
         * (lines), and the inner loop controls the number of asterisks printed
         * in each row. For each row, the inner loop iterates from 1 up to the
         * current row number, printing an asterisk in each iteration. The
         * 'println()' statement after the inner loop moves the output to the
         * next line, forming the triangular shape.
         */
    }
}