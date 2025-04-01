package basics.operators;

public class AirthmeticOperatorUnary {
    public static void main(String[] args) {

        /*
        Unary operators only require one operand and are used to modify the value of that operand.

        ++a = a + 1; // Increment a by 1 (pre-increment)
        --a = a - 1; // Decrement a by 1 (pre-decrement)

        ++a = Pre-increment: Increments the value of a before it is used in an expression.
        a++ = Post-increment: Increments the value of a after it is used in an expression.

        --a = Pre-decrement: Decrements the value of a before it is used in an expression.
        a-- = Post-decrement: Decrements the value of a after it is used in an expression.
         */

        int a = 10;

        // Using pre-increment operator (pre-increment means incrementing before using the value)
        int b = ++a;  // a is incremented first, then the value of a is assigned to b
        System.out.println(a);  // Expected output: 11 (because a was incremented before assignment)
        System.out.println(b);  // Expected output: 11 (value of a after increment is assigned to b)

        int c = 10;

        // Using post-increment operator (post-increment means using the value first, then incrementing it)
        int d = c++;  // First the value of c is assigned to d, then c is incremented
        System.out.println(c);  // Expected output: 11 (because c was incremented after assignment)
        System.out.println(d);  // Expected output: 10 (the original value of c before increment)

        // DSA Insight:
        // In Data Structures and Algorithms (DSA), unary operators are useful in various algorithms where
        // we need to increment or decrement a value frequently, such as in loops, iterative algorithms,
        // or when working with pointers or indices in arrays.

        // Example in DSA: Using pre-increment and post-increment in loops or searching algorithms
        // - A common usage is within for-loops where we might increment a counter (index) each time:
        //   for (int i = 0; i < n; i++) {
        //       // Loop body
        //   }

        // Example with pre-increment:
        // - Pre-increment is often used when we want to change a value before using it:
        //   int index = ++i;  // Increment first, then use the value in the index.

        // Example with post-increment:
        // - Post-increment is used when we want to use the value first, and then modify it:
        //   int index = i++;  // Use the current value of i, then increment it.

        // Understanding these unary operators helps in manipulating values effectively in algorithms like
        // traversing arrays, performing calculations, or managing loop variables.
    }
}
