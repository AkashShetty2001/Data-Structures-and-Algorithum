package basics.nestedLoops.AdvancePatterns;

import java.util.Scanner;

/*

    print pattern


    *      *
    **    **
    ***  ***
    ********
    ********
    ***  ***
    **    **
    *      *


 */
public class ButterflyPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();

        // Upper half of the butterfly
        for (int i = 1; i <= n; i++) {
            // First set of stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Middle spaces
            for (int j = 1; j <= (2 * (n - i)); j++) {
                System.out.print(" ");
            }
            // Second set of stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }

        // Lower half of the butterfly (inverted upper half)
        for (int i = n; i >= 1; i--) {
            // First set of stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Middle spaces
            for (int j = 1; j <= (2 * (n - i)); j++) {
                System.out.print(" ");
            }
            // Second set of stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }

        /*
         * Logic Summary:
         * This program uses nested loops to print a butterfly pattern.
         * It is divided into two main parts: the upper half and the lower half,
         * which is an inverted version of the upper half.
         *
         * Upper Half:
         * The outer loop iterates 'n' times, controlling the rows.
         * For each row 'i', the first inner loop prints 'i' asterisks.
         * The second inner loop prints '(2 * (n - i))' spaces in the middle.
         * The third inner loop prints another 'i' asterisks.
         *
         * Lower Half:
         * The outer loop iterates from 'n' down to 1, controlling the rows.
         * The logic for printing stars and spaces in the inner loops is the
         * same as the upper half, but the number of stars and spaces changes
         * due to the decreasing value of 'i', creating the inverted shape.
         *
         * 'println()' is used after each row to move the output to the next line,
         * forming the complete butterfly pattern.
         */
    }
}