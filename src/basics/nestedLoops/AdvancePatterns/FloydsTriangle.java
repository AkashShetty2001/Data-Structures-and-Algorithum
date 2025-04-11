package basics.nestedLoops.AdvancePatterns;

import java.util.Scanner;

/*

    print pattern

    1
    2 3
    4 5 6
    7 8 9 10
    11 12 13 14 15

 */
public class FloydsTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        sc.close();

        int num = 1; // Initialize the starting number.

        // Outer loop: Iterates through each row.
        for (int i = 1; i <= n; i++) {

            // Inner loop: Prints numbers for the current row.
            // The number of printed numbers increases with each row.
            for (int j = 1; j <= i; j++) {
                System.out.print(num++ + " "); // Print the current number and then increment it.
            }
            System.out.println(); // Move to the next line after printing numbers for the current row.
        }

        /*
         * Logic Summary:
         * This program uses nested loops to print Floyd's Triangle.
         * The outer loop iterates 'n' times, controlling the number of rows.
         * A variable 'num' is initialized to 1 and keeps track of the next
         * number to be printed. The inner loop, for each row 'i', iterates
         * from 1 to 'i', printing the current value of 'num' followed by a
         * space, and then incrementing 'num'. This ensures that the numbers
         * are printed sequentially across the rows, with each row containing
         * one more number than the previous row. The 'println()' statement
         * after the inner loop moves the output to the next line, forming
         * the triangular structure of Floyd's Triangle.
         */
    }
}