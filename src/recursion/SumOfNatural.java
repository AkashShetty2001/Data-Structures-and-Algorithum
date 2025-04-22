package recursion;

import java.util.Scanner;

public class SumOfNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n = sc.nextInt();

        System.out.println("Sum of first " + n + " natural numbers is: " + sum(n));
        sc.close();
    }

    /**
     * Calculates the sum of the first n natural numbers using recursion.
     *
     * @param n The number of natural numbers to sum.
     * @return The sum of the first n natural numbers.
     * @throws IllegalArgumentException if n is negative.
     */
    public static int sum(int n) {
        // Base case: If n is 0 or negative, the sum is 0.
        if (n <= 0) {
            return 0;
        }
        // Recursive step: Sum(n) = n + Sum(n-1)
        return n + sum(n - 1);
    }
}
/*
 * Logic Summary:
 * This program calculates the sum of the first 'n' natural numbers (1 to n)
 * using a recursive function.
 *
 * Main Function:
 * The 'main' function takes an integer input 'n' from the user and then calls
 * the 'sum' function to calculate the sum of natural numbers up to 'n'. The
 * result is then printed to the console.
 *
 * sum Function (Recursive):
 * - Base Case: The recursion stops when 'n' is less than or equal to 0. In this
 * case, the function returns 0, as there are no natural numbers to sum.
 * - Recursive Step: If 'n' is greater than 0, the function returns the sum of
 * 'n' and the sum of the first 'n-1' natural numbers (which is calculated by
 * recursively calling the 'sum' function with 'n-1').
 *
 * The recursion continues until the base case is reached. The results are then
 * added back up the call stack to compute the final sum.
 *
 * Time Complexity (TC): O(n)
 * The function 'sum' is called 'n' times, where 'n' is the input number. Each
 * call performs a constant amount of work (comparison and addition). Therefore,
 * the time complexity is linear with respect to 'n'.
 *
 * Space Complexity (SC): O(n)
 * The space complexity is determined by the depth of the recursion stack. In the
 * worst case, there will be 'n' recursive calls before the base case is reached.
 * Each call adds a new frame to the stack to store the local variable 'n' and
 * the return address. Hence, the space complexity is proportional to 'n'.
 */