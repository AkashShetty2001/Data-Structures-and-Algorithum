package recursion;

import java.util.Scanner;

public class PrintDecreasingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n = sc.nextInt();

        printDecreasing(n); // Call the recursive function to print in decreasing order
        sc.close();
    }

    /**
     * Recursively prints numbers from n down to 0.
     *
     * @param n The starting number for the decreasing sequence.
     */
    private static void printDecreasing(int n) {
        // Base case: When n reaches 0, print 0 and stop the recursion.
        if (n == 0) {
            System.out.println(n);
            return; // Exit the current function call
        }

        // Work: Print the current value of n.
        System.out.println(n);

        // Recursive call: Call the same function with n-1 to continue the sequence.
        printDecreasing(n - 1);
    }

}
/*
 * Logic Summary:
 * This program demonstrates recursion to print numbers in decreasing order from
 * a given input 'n' down to 0.
 *
 * Main Function:
 * The 'main' function takes an integer input 'n' from the user and then calls
 * the 'printDecreasing' function with this input to start the recursive process.
 *
 * printDecreasing Function (Recursive):
 * - Base Case: The recursion stops when the value of 'n' becomes 0. At this point,
 * '0' is printed, and the 'return' statement exits the current function call,
 * unwinding the recursion.
 * - Work: In each recursive call (before the base case is reached), the current
 * value of 'n' is printed to the console.
 * - Recursive Call: The function then calls itself ('printDecreasing') with the
 * argument 'n-1'. This step reduces the value of 'n' in each subsequent call,
 * eventually leading to the base case.
 *
 * The sequence of operations is: print 'n', then call with 'n-1', which prints
 * 'n-1' and calls with 'n-2', and so on, until '0' is printed and the calls
 * start returning. This results in the numbers being printed in decreasing order.
 */