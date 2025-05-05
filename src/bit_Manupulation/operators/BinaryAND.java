package bit_Manupulation.operators;

/*
    '&' - Binary AND Operator

    The AND operator compares corresponding bits of two operands.
    The result bit is 1 only if both corresponding bits of the two operands are 1; otherwise, it's 0.

    Truth Table:
    0 & 0 = 0
    1 & 0 = 0
    0 & 1 = 0
    1 & 1 = 1
*/
public class BinaryAND {
    public static void main(String[] args) {
        // Binary representation of 5: 0101
        // Binary representation of 6: 0110
        // 5 & 6:
        //   0101
        // & 0110
        // ------
        //   0100  (which is decimal 4)
        System.out.println(5 & 6); // Output: 4

        // Important points for DSA problem solving using AND:

        // 1. Checking if a specific bit is set:
        //    To check if the i-th bit of a number 'n' is 1, you can use the AND operator with a mask that has only the i-th bit set.
//        int n = 5;      // Binary: 0101
//        int i = 2;      // Check the 2nd bit (0-indexed)
//        int mask = 1 << i; // Binary: 0100
//        if ((n & mask) != 0) {
//            System.out.println("The " + i + "-th bit of " + n + " is set (1)."); // Output: The 2-th bit of 5 is set (1).
//        } else {
//            System.out.println("The " + i + "-th bit of " + n + " is not set (0).");
//        }
//
//        int m = 6;      // Binary: 0110
//        int j = 0;      // Check the 0th bit
//        int mask2 = 1 << j; // Binary: 0001
//        if ((m & mask2) != 0) {
//            System.out.println("The " + j + "-th bit of " + m + " is set (1).");
//        } else {
//            System.out.println("The " + j + "-th bit of " + m + " is not set (0)."); // Output: The 0-th bit of 6 is not set (0).
//        }
//
//        // 2. Masking: Isolating specific bits:
//        //    You can use AND with a mask to extract certain bits from a number.
//        int num = 13;     // Binary: 1101
//        int lowerNibbleMask = 0b00001111; // Mask for the lower 4 bits
//        int lowerNibble = num & lowerNibbleMask; // 1101 & 00001111 = 00001101 (decimal 13)
//        System.out.println("Lower nibble of " + num + ": " + lowerNibble);
//
//        int upperNibbleMask = 0b11110000; // Mask for the upper 4 bits (assuming 8-bit representation for clarity)
//        int upperNibbleShifted = (num & upperNibbleMask) >> 4; // (1101 & 11110000) >> 4 = 11010000 >> 4 = 00001101 (decimal 13 - incorrect for upper, should be 1)
//        int actualUpperNibble = (num >> 4) & 0b00001111; // Correct way to get upper nibble
//        System.out.println("Upper nibble of " + num + ": " + actualUpperNibble); // Output: Upper nibble of 13: 1
//
//        // 3. Checking for common set bits:
//        //    `a & b` will have bits set only where both `a` and `b` have those bits set.
//        int set1 = 7;  // Binary: 0111
//        int set2 = 3;  // Binary: 0011
//        int commonBits = set1 & set2; // 0111 & 0011 = 0011 (decimal 3)
//        System.out.println("Common set bits in " + set1 + " and " + set2 + ": " + commonBits);
//
//        // 4. Checking if a number is even or odd:
//        //    The least significant bit (LSB) is 1 for odd numbers and 0 for even numbers.
//        //    `n & 1 == 0` if n is even, and `n & 1 == 1` if n is odd.
//        int numToCheck1 = 10;
//        if ((numToCheck1 & 1) == 0) {
//            System.out.println(numToCheck1 + " is even."); // Output: 10 is even.
//        } else {
//            System.out.println(numToCheck1 + " is odd.");
//        }
//
//        int numToCheck2 = 15;
//        if ((numToCheck2 & 1) == 0) {
//            System.out.println(numToCheck2 + " is even.");
//        } else {
//            System.out.println(numToCheck2 + " is odd."); // Output: 15 is odd.
//        }
    }
}