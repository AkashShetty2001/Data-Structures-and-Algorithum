package bit_Manupulation.operators;

/*
    '^' - Binary XOR (Exclusive OR) Operator

    The XOR operator compares corresponding bits of two operands.
    The result bit is 1 if the corresponding bits of the two operands are different; otherwise, it's 0.

    Truth Table:
    0 ^ 0 = 0
    1 ^ 0 = 1
    0 ^ 1 = 1
    1 ^ 1 = 0

    Key Property: XORing a number with itself results in 0 (n ^ n = 0).
                  XORing a number with 0 results in the number itself (n ^ 0 = n).
                  XOR is commutative (a ^ b = b ^ a) and associative (a ^ (b ^ c) = (a ^ b) ^ c).
*/
public class BinaryXOR {
    public static void main(String[] args) {
        // Binary representation of 5: 0101
        // Binary representation of 6: 0110
        // 5 ^ 6:
        //   0101
        // ^ 0110
        // ------
        //   0011  (which is decimal 3)
        System.out.println(5 ^ 6); // Output: 3

        // Important points for DSA problem solving using XOR:

        // 1. Finding the single unique element:
        //    If all numbers in an array appear an even number of times except for one,
        //    XORing all the elements will result in the unique element.
//        int[] arrUnique = {1, 2, 1, 3, 2};
//        int unique = 0;
//        for (int num : arrUnique) {
//            unique ^= num;
//        }
//        System.out.println("Unique element: " + unique); // Output: 3
//
//        // 2. Swapping two numbers without a temporary variable:
//        int a = 5;
//        int b = 6;
//        System.out.println("Before swap: a = " + a + ", b = " + b);
//        a = a ^ b;
//        b = a ^ b;
//        a = a ^ b;
//        System.out.println("After swap: a = " + a + ", b = " + b);
//
//        // 3. Checking if two numbers are different:
//        //    If a ^ b is non-zero, then a and b are different.
//        int x = 10;
//        int y = 10;
//        if ((x ^ y) == 0) {
//            System.out.println(x + " and " + y + " are the same.");
//        } else {
//            System.out.println(x + " and " + y + " are different.");
//        }
//
//        int p = 7;
//        int q = 3;
//        if ((p ^ q) == 0) {
//            System.out.println(p + " and " + q + " are the same.");
//        } else {
//            System.out.println(p + " and " + q + " are different."); // Output: 7 and 3 are different.
//        }
//
//        // 4. Toggling bits:
//        //    XORing a number with a mask that has a '1' at a specific bit position will toggle that bit.
//        int numToToggle = 10; // Binary: 1010
//        int mask = 1 << 1;    // Binary: 0010 (mask for the 1st bit from the right, 0-indexed)
//        int toggledNum = numToToggle ^ mask; // 1010 ^ 0010 = 1000 (decimal 8)
//        System.out.println("Toggled " + numToToggle + " with mask " + mask + " to get " + toggledNum);
    }
}