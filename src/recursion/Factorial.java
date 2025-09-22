package recursion;

import java.util.Scanner;

/*
    factorial of n using recursion.
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();

        System.out.println("Factorial of " + n + " is: " + fact(n));
        System.out.println("Factorial of " + n + "  iterative is: " + factIterative(n));
        sc.close();
    }

    /**
     * Calculates the factorial of a non-negative integer n using recursion.
     *
     * @param n The non-negative integer for which to calculate the factorial.
     * @return The factorial of n.
     * @throws IllegalArgumentException if n is negative.
     */
    public static int fact(int n) {
        // Base case: Factorial of 1 is 1. Factorial of 0 is also typically defined as 1.
        if (n <= 1) {
            return 1;
        }
        // Recursive step: n! = n * (n-1)!
        return n * fact(n - 1);
    }

    public static int factIterative(int n){
        int fact=1;
        for(int i=2;i<=n;i++){
            fact*=i;
        }
        return fact;
    }

}
/*
 * Logic Summary:
 * This program calculates the factorial of a given non-negative integer 'n'
 * using a recursive function.
 *
 * Main Function:
 * The 'main' function takes an integer input 'n' from the user and then calls
 * the 'fact' function to calculate its factorial. The result is then printed
 * to the console.
 *
 * fact Function (Recursive):
 * - Base Case: The recursion stops when 'n' is less than or equal to 1. In this
 * case, the function returns 1, as the factorial of 1 and 0 is 1.
 * - Recursive Step: If 'n' is greater than 1, the function returns the product
 * of 'n' and the factorial of 'n-1' (which is calculated by recursively calling
 * the 'fact' function with 'n-1').
 *
 * The recursion continues until the base case is reached. The results are then
 * multiplied back up the call stack to compute the final factorial value.
 *
 * Time Complexity (TC): O(n)
 * The function 'fact' is called 'n' times, where 'n' is the input number. Each
 * call performs a constant amount of work (comparison and multiplication).
 * Therefore, the time complexity is linear with respect to 'n'.
 *
 * Space Complexity (SC): O(n)
 * The space complexity is determined by the depth of the recursion stack. In the
 * worst case, there will be 'n' recursive calls before the base case is reached.
 * Each call adds a new frame to the stack to store the local variable 'n' and
 * the return address. Hence, the space complexity is proportional to 'n'.
 */