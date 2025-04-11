package basics.nestedLoops.AdvancePatterns;

import java.util.Scanner;

/*

print pattern

       *
      **
     ***
    ****

 */
public class InvertedRoatedHalfPyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n = sc.nextInt();

        // Outer loop: Iterates through each row.
        for (int i = 1; i <= n; i++) {

            // Inner loop 1: Prints leading spaces.
            // The number of spaces decreases with each row.
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Inner loop 2: Prints asterisks.
            // The number of asterisks increases with each row.
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println(); // Move to the next line after printing spaces and asterisks.
        }

        /*
         * Logic Summary:
         * This program uses nested loops to print an inverted rotated half-pyramid
         * pattern of asterisks. The outer loop iterates through the specified
         * number of rows ('n'). For each row, the first inner loop prints a
         * certain number of leading spaces. The number of spaces decreases as
         * the row number increases, creating the indentation. The second inner
         * loop then prints an increasing number of asterisks, equal to the current
         * row number. Finally, 'println()' moves the output to the next line to
         * form the pyramid shape that is inverted and rotated to the right.
         */
    }

}