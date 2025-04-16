package basics.nestedLoops.AdvancePatterns;

import java.util.Scanner;

/*

    print pattern

       *
      ***
     *****
    *******
    *******
     *****
      ***
       *
 */
public class DaimondPattern {
    public static void main(String args[]){

        Scanner
                sc = new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n= sc.nextInt();

        // Upper part of the diamond
        for(int i=1; i<=n; i++){

            // Print leading spaces for the current row
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            // Print asterisks for the current row (number increases with row number)
            for(int j=1; j<=((2*i)-1); j++){
                System.out.print("*");
            }

            // Move to the next line after printing the row
            System.out.println();
        }

        // Lower part of the diamond (excluding the middle row which is common)
        for(int i=n-1; i>=1; i--){ // Start from n-1 to avoid repeating the middle row

            // Print leading spaces for the current row (number increases as we go down)
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            // Print asterisks for the current row (number decreases as we go down)
            for(int j=1; j<=((2*i)-1); j++){
                System.out.print("*");
            }

            // Move to the next line after printing the row
            System.out.println();
        }
    }
}
/*
 * Logic Summary:
 * This program prints a diamond pattern using nested loops. It's divided into
 * an upper and a lower part.
 *
 * Upper Part:
 * The outer loop iterates from 1 to 'n', controlling the rows of the upper half.
 * For each row 'i', the first inner loop prints 'n-i' leading spaces, creating
 * the indentation. The second inner loop prints '(2*i - 1)' asterisks, with the
 * number of asterisks increasing by 2 in each subsequent row.
 *
 * Lower Part:
 * The outer loop iterates from 'n-1' down to 1, controlling the rows of the
 * lower half (excluding the middle row). The logic for printing spaces and
 * asterisks is the same as the upper half, but the number of spaces increases
 * and the number of asterisks decreases as 'i' decreases, creating the inverted
 * shape.
 *
 * 'println()' is used after each inner loop to move the output to the next line,
 * forming the complete diamond pattern.
 */