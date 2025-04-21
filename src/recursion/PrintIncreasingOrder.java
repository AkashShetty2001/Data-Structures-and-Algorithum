package recursion;

import java.util.Scanner;

public class PrintIncreasingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n = sc.nextInt();

        sc.close();

        printInc(n); // Call the recursive function to print in increasing order
    }

    /**
     * Recursively prints numbers from 0 up to n.
     *
     * @param n The ending number for the increasing sequence.
     */
    private static void printInc(int n) {
        // Base case: When n reaches 0, print 0 and stop the recursion.
        if (n == 0) {
            System.out.println(n);
            return; // Exit the current function call
        }

        // Recursive call: Call the same function with n-1.
        // This will continue until the base case is reached.
        printInc(n - 1);

        // Work: After the recursive call returns (meaning numbers up to n-1
        // have been printed), print the current value of n.
        System.out.println(n);
    }
}
/*
 * Logic Summary:
 * This program demonstrates recursion to print numbers in increasing order from
 * 0 up to a given input 'n'.
 *
 * Main Function:
 * The 'main' function takes an integer input 'n' from the user and then calls
 * the 'printInc' function with this input to start the recursive process.
 *
 * printInc Function (Recursive):
 * - Base Case: The recursion stops when the value of 'n' becomes 0. At this point,
 * '0' is printed, and the 'return' statement exits the current function call,
 * starting the unwinding of the recursion.
 * - Recursive Call: Before performing any work in the current call, the function
 * calls itself ('printInc') with the argument 'n-1'. This continues until 'n'
 * becomes 0.
 * - Work: After the recursive call returns (meaning all numbers from 0 up to 'n-1'
 * have been processed and printed in earlier calls), the current value of 'n' is
 * printed to the console.
 *
 * The sequence of operations is: call with 'n', then call with 'n-1', ..., call
 * with '0' (base case prints 0 and returns). Then, as the calls return, the
 * 'println(n)' statement in each call executes in reverse order of the calls,
 * resulting in the numbers being printed from 0 up to 'n' in increasing order.
 */