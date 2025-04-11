package basics.nestedLoops.AdvancePatterns;

import java.util.Scanner;

/*

    print pattern

    1
    0 1
    1 0 1
    0 1 0 1
    1 0 1 0 1

 */
public class ZeroOneTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();

        // Outer loop: Iterates through each row.
        for (int i = 1; i <= n; i++) {

            // Inner loop: Prints 0s and 1s for the current row.
            // The number of digits increases with each row.
            for (int j = 1; j <= i; j++) {
                // Check if the sum of the current row and column index is even.
                if ((i + j) % 2 == 0) {
                    System.out.print("1" + " "); // Print 1 if the sum is even.
                } else {
                    System.out.print("0" + " "); // Print 0 if the sum is odd.
                }
            }
            System.out.println(); // Move to the next line after printing digits for the current row.
        }

        /*
         * Logic Summary:
         * This program uses nested loops to print a triangle pattern of 0s and 1s.
         * The outer loop iterates 'n' times, controlling the number of rows.
         * The inner loop, for each row 'i', iterates from 1 to 'i', determining
         * the digit to print. The condition '(i + j) % 2 == 0' checks if the sum
         * of the current row number 'i' and the current column number 'j' is even.
         * If it is even, '1' is printed; otherwise, '0' is printed. This creates
         * the alternating pattern of 1s and 0s in the triangle. The 'println()'
         * statement after the inner loop moves the output to the next line for
         * the subsequent row.
         */
    }
}