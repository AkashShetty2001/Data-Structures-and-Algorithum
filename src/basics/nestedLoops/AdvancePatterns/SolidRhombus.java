package basics.nestedLoops.AdvancePatterns;

import java.util.Scanner;

/*

    print pattern

        *****
       *****
     *****
    *****
   *****


 */
public class SolidRhombus {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n= sc.nextInt();

        // Outer loop: Iterates through each row of the rhombus
        for(int i=1; i<=n; i++){

            // Inner loop 1: Prints leading spaces to create the rhombus shape
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            // Inner loop 2: Prints asterisks for the solid part of the rhombus
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }

            // Move to the next line after printing the row
            System.out.println();
        }
    }
}
/*
 * Logic Summary:
 * This program prints a solid rhombus pattern using nested loops.
 *
 * Outer Loop:
 * The outer loop iterates 'n' times, where 'n' is the number of rows,
 * controlling each row of the rhombus.
 *
 * Inner Loop 1 (Spaces):
 * The first inner loop prints leading spaces for each row. The number of
 * spaces decreases as the row number 'i' increases. This creates the left
 * indentation that gives the rhombus its slanted appearance. The number of
 * spaces printed is 'n - i'.
 *
 * Inner Loop 2 (Asterisks):
 * The second inner loop prints a fixed number of asterisks, equal to 'n',
 * for each row. This forms the solid horizontal line of the rhombus.
 *
 * 'println()' is used after the inner loops to move the output to the next line,
 * thus constructing the rhombus row by row.
 */