package recursion;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enetr the value of n:");
        int n = sc.nextInt();

        System.out.println("The " + n + "th Fibonacci number is: " + fibo(n));
        System.out.println(fib(n));
        sc.close();
    }

    /**
     * Calculates the nth Fibonacci number using recursion.
     * The Fibonacci sequence starts with 0 and 1, and each subsequent
     * number is the sum of the two preceding ones.
     *
     * @param n The index of the desired Fibonacci number (non-negative integer).
     * @return The nth Fibonacci number.
     */
    public static int fibo(int n) {
        // Base cases:
        // The 0th Fibonacci number is 0.
        if (n == 0) {
            return 0;
        }
        // The 1st Fibonacci number is 1.
        if (n == 1) {
            return 1;
        }

        // Recursive step: The nth Fibonacci number is the sum of the (n-1)th
        // and (n-2)th Fibonacci numbers.
        return fibo(n - 1) + fibo(n - 2);
    }

    public static int fib(int n){
        int f=0;
        int s=1;
        int c=0;
        int count =2;

        while(count <= n){
            c=f+s;
            f=s;
            s=c;
            count++;
        }
        return c;
    }
}
/*
 * Logic Summary:
 * This program calculates the nth Fibonacci number using a recursive function.
 * The Fibonacci sequence is defined such that the first two numbers are 0 and 1,
 * and each subsequent number is the sum of the two preceding ones (e.g., 0, 1, 1, 2, 3, 5, ...).
 *
 * Main Function:
 * The 'main' function takes an integer input 'n' from the user, representing the
 * index of the Fibonacci number to be calculated. It then calls the 'fibo'
 * function with this input and prints the result to the console.
 *
 * fibo Function (Recursive):
 * - Base Cases:
 * - If 'n' is 0, the function returns 0 (the 0th Fibonacci number).
 * - If 'n' is 1, the function returns 1 (the 1st Fibonacci number).
 * - Recursive Step: If 'n' is greater than 1, the function recursively calls
 * itself twice: once with 'n-1' and once with 'n-2'. The result of the current
 * call is the sum of the results of these two recursive calls. This directly
 * implements the definition of the Fibonacci sequence.
 *
 * Time Complexity (TC): O(2^n)
 * The time complexity of this recursive solution is exponential. For each call
 * to 'fibo(n)' (where n > 1), there are two more recursive calls. This leads to
 * a branching factor of 2, resulting in a tree of recursive calls with a depth of 'n'.
 * Many subproblems are computed repeatedly, leading to inefficiency.
 *
 * Space Complexity (SC): O(n)
 * The space complexity is determined by the maximum depth of the recursion stack.
 * In the worst case, the recursion can go as deep as 'n' (e.g., for 'fibo(n)', it
 * goes down to 'fibo(0)' or 'fibo(1)'). Each recursive call adds a frame to the
 * stack. Therefore, the space complexity is linear with respect to 'n'.
 */