package basics.operators;

public class AirthmeticOperatorsBinary {
    public static void main(String []args){

        // Declare two integer variables a and b
        int a = 10;
        int b = 5;

        // Print the result of adding a and b using the + operator
        // Addition operator (+) is used to sum two operands (a + b)
        System.out.println("add = " + (a + b)); // Expected output: 15

        // Print the result of subtracting b from a using the - operator
        // Subtraction operator (-) is used to subtract the second operand (b) from the first operand (a)
        System.out.println("sub = " + (a - b)); // Expected output: 5

        // Print the result of multiplying a and b using the * operator
        // Multiplication operator (*) is used to multiply two operands (a * b)
        System.out.println("mul = " + (a * b)); // Expected output: 50

        // Print the result of dividing a by b using the / operator
        // Division operator (/) is used to divide the first operand (a) by the second operand (b)
        // Note: This performs integer division (without decimals) because a and b are integers
        System.out.println("div = " + (a / b)); // Expected output: 2

        // Print the result of finding the remainder when a is divided by b using the % operator
        // Modulo operator (%) is used to find the remainder of the division of a by b
        // In this case, 10 divided by 5 gives a remainder of 0
        System.out.println("modulo(remainder) = " + (a % b)); // Expected output: 0

        // DSA Insight:
        // In Data Structures and Algorithms (DSA), we frequently use basic operators like these
        // for various algorithmic operations like searching, sorting, and manipulating data.
        // For example:
        // - The modulo operation (%) is commonly used in hashing algorithms and modular arithmetic.
        // - Division and multiplication are used in binary search algorithms to calculate mid-point.
        // - These operators help in traversing arrays, performing calculations for loops, and optimizing solutions.

        // Example in DSA: Division is used to find the middle element in a sorted array when performing binary search:
        // If 'low' and 'high' are the bounds of the current search space:
        // int mid = low + (high - low) / 2;

        // By using simple arithmetic operators, we can make efficient decisions in various algorithms.
    }
}
