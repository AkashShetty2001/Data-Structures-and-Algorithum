package basics.nestedLoops;

public class InvertedStar {
    public static void main(String[] args) {
        /*

        print pattern

        ****
        ***
        **
        *

         */

        int stars = 4; // Total number of stars in the first line.

        // Outer loop: Iterates through each line (4 lines).
        for (int line = 1; line <= 4; line++) {

            // Inner loop: Prints asterisks for the current line.
            // The number of asterisks decreases with each line.
            // Formula: totalStars - currentLine + 1
            for (int j = 1; j <= stars - line + 1; j++) {
                System.out.print("*"); // Print a single asterisk.
            }

            System.out.println(); // Move to the next line after printing asterisks.
        }

        /*
         * Logic Summary:
         * This program uses nested loops to print an inverted right-angled
         * triangle pattern of asterisks. The outer loop controls the number
         * of rows (lines). The inner loop controls the number of asterisks
         * printed in each row. The number of asterisks in each row is
         * determined by the formula 'totalStars - currentLine + 1', which
         * causes the number of asterisks to decrease with each subsequent line.
         * The 'println()' statement moves the output to the next line after
         * printing the asterisks for the current row.
         */
    }
}