package basics.nestedLoops.AdvancePatterns;

/*
print pattern

         *****
        *   *
       *   *
      *   *
     *****


 */

import java.util.Scanner;

public class HollowRhombus {
    public static void main(String args[]){
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter the value of n");
        int n= sc.nextInt();

        // Outer loop: Iterates through each row of the rhombus
        for(int i =1; i<=n; i++){

            // Inner loop 1: Prints leading spaces to create the rhombus shape
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            // Inner loop 2: Prints asterisks and spaces for the hollow part
            for(int j=1; j<=n; j++){
                // Check if the current position is on the border of the rhombus
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*"); // Print an asterisk for the border
                }else{
                    System.out.print(" "); // Print a space for the hollow interior
                }
            }
            // Move to the next line after printing the row
            System.out.println();
        }
    }
}
/*
 * Logic Summary:
 * This program prints a hollow rhombus pattern using nested loops.
 *
 * Outer Loop:
 * The outer loop iterates 'n' times, where 'n' is the number of rows,
 * controlling each row of the rhombus.
 *
 * Inner Loop 1 (Spaces):
 * The first inner loop prints leading spaces for each row. The number of
 * spaces decreases as the row number 'i' increases, creating the left
 * indentation for the slanted shape. The number of spaces printed is 'n - i'.
 *
 * Inner Loop 2 (Asterisks and Spaces):
 * The second inner loop iterates 'n' times, representing the columns of the
 * rhombus. Inside this loop, a conditional statement checks if the current
 * cell is on the boundary of the rhombus. The boundary conditions are:
 * - The first row (i == 1)
 * - The last row (i == n)
 * - The first column (j == 1)
 * - The last column (j == n)
 * If any of these conditions are true, an asterisk '*' is printed. Otherwise,
 * a space ' ' is printed, creating the hollow interior of the rhombus.
 *
 * 'println()' is used after the inner loops to move the output to the next line,
 * constructing the rhombus row by row.
 */