package basics.nestedLoops.AdvancePatterns;

import java.util.Scanner;

/*

    print pattern

    *****
    * *
    * *
    * *
    *****
 */
public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows and columns");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        // Outer loop: Iterates through each row.
        for (int i = 1; i <= rows; i++) {

            // Inner loop: Iterates through each column in the current row.
            for (int j = 1; j <= cols; j++) {
                // Check if the current cell is on the boundary (first/last row or first/last column).
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("*"); // Print an asterisk for the boundary.
                } else {
                    System.out.print(" "); // Print a space for the inner hollow part.
                }
            }
            System.out.println(); // Move to the next line after printing all columns in the current row.
        }

        /*
         * Logic Summary:
         * This program uses nested loops to print a hollow rectangle pattern.
         * The outer loop iterates through the specified number of rows.
         * The inner loop iterates through the specified number of columns in each row.
         * Inside the inner loop, a conditional statement checks if the current cell
         * (defined by row 'i' and column 'j') is located on the boundary of the
         * rectangle (i.e., the first or last row, or the first or last column).
         * If it's a boundary cell, an asterisk '*' is printed. Otherwise, a space ' '
         * is printed, creating the hollow effect. After processing all columns in a
         * row, 'println()' moves the output to the next line to start the next row.
         */
    }
}