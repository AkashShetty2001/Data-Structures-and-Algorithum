package basics.nestedLoops;

public class HalfPyramid {
    public static void main(String[] args) {
        /*

        print pattern

        1
        12
        123
        1234

         */

        int n = 4; // Defines the number of rows in the pyramid.

        // Outer loop: Iterates through each line, from 1 to n.
        for (int i = 1; i <= n; i++) {

            // Inner loop: Prints numbers for the current line.
            // It prints numbers from 1 up to the current line number (i).
            for (int j = 1; j <= i; j++) {
                System.out.print(j); // Print the current number in the sequence.
            }

            System.out.println(); // Move to the next line after printing all numbers for the current row.
        }

        /*
         * Logic Summary:
         * This program uses nested loops to print a half pyramid pattern of numbers.
         * The outer loop iterates 'n' times, controlling the number of rows.
         * The inner loop, for each row 'i', iterates from 1 to 'i', printing
         * the value of 'j' in each iteration. This results in each row having
         * numbers from 1 up to the current row number. The 'println()' after
         * the inner loop ensures that each row is printed on a new line.
         */
    }
}