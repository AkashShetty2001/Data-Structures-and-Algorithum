package basics.nestedLoops.AdvancePatterns;

import java.util.Scanner;

/*

    print pattern

    12345
    1234
    123
    12
    1

 */
public class InvertedHalfPyramidNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        // Outer loop: Iterates through each row.
        for (int i = 1; i <= n; i++) {

            // Inner loop: Prints numbers from 1 up to (n - i + 1).
            // The number of printed digits decreases with each row.
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j); // Print the current number.
            }
            System.out.println(); // Move to the next line after printing numbers for the current row.
        }

        /*
         * Logic Summary:
         * This program uses nested loops to print an inverted half-pyramid
         * pattern of numbers. The outer loop iterates 'n' times, controlling
         * the number of rows. The inner loop, for each row 'i', iterates
         * from 1 up to 'n - i + 1'. In each iteration of the inner loop,
         * the value of 'j' is printed. This results in the first row printing
         * numbers from 1 to 'n', the second row printing from 1 to 'n-1',
         * and so on, until the last row prints only '1'. The 'println()'
         * statement after the inner loop ensures that each row of numbers
         * is printed on a new line, forming the inverted pyramid shape.
         */
    }
}