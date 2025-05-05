package bit_Manupulation.operators;

/*
    a<<b point out the arrows
    move a by b places towards left

    imp formula
    (a*2^b)
 */

/*
    '<<' - Binary Left Shift Operator

    The left shift operator (`<<`) shifts the bits of the left operand (`a`) to the left by the number of positions specified by the right operand (`b`).
    Zero bits are shifted in from the right.

    Visual Representation (for a = 5, b = 2):

    Original binary of a (5):  00000101
                                ^^^^^^^^
    Shift left by 1 (5 << 1): 00001010  (Multiplied by 2)
                                ^^^^^^^0
    Shift left by 2 (5 << 2): 00010100  (Multiplied by 2 again)
                                ^^^^^00

    The bits originally at the leftmost positions are discarded if the shift amount is large enough to push them out of the operand's size.

    Important Formula:
    Left shifting `a` by `b` positions is equivalent to multiplying `a` by 2 raised to the power of `b` ($a \times 2^b$).
*/
public class BinaryLeftShift {
    public static void main(String[] args) {
        int a = 5; // Binary: 00000101
        int b = 2;

        int result = a << b; // 5 << 2

        // Calculation: 5 * (2^2) = 5 * 4 = 20
        // Binary of 20: 00010100

        System.out.println(a + " << " + b + " = " + result); // Output: 5 << 2 = 20

        // Important points for DSA problem solving using Left Shift:

        // 1. Efficient Multiplication by Powers of 2:
        //    Left shift provides a fast way to multiply an integer by powers of 2. This can be significantly faster than using the multiplication operator in some scenarios.

//        int numToMultiply = 7; // Binary: 00000111
//        int multiplyBy4 = numToMultiply << 2; // 7 * (2^2) = 28 (Binary: 00011100)
//        System.out.println(numToMultiply + " << 2 = " + multiplyBy4);
//
//        // 2. Creating Bitmasks:
//        //    Left shift is commonly used to create bitmasks with a '1' at a specific position.
//        int maskForBit3 = 1 << 3; // Creates a mask with only the 3rd bit set (0-indexed): 00001000 (decimal 8)
//        System.out.println("Mask for bit 3: " + maskForBit3 + " (Binary: " + Integer.toBinaryString(maskForBit3) + ")");
//
//        // 3. Setting Bits:
//        //    You can use left shift with the OR operator to set a specific bit in a number.
//        int numToSetBit = 2; // Binary: 00000010
//        int bitToSet = 1;
//        int setToOne = numToSetBit | (1 << bitToSet); // 00000010 | 00000010 = 00000010 (Error in example, should be | (1 << 1))
//        int correctlySetToOne = numToSetBit | (1 << bitToSet); // 00000010 | 00000010 = 00000010 (Still error in logic)
//
//        int numToSetBitCorrect = 2; // Binary: 00000010
//        int bitToSetCorrect = 2;
//        int correctlySetToOneExample = numToSetBitCorrect | (1 << bitToSetCorrect); // 00000010 | 00000100 = 00000110 (decimal 6)
//        System.out.println("Setting bit " + bitToSetCorrect + " in " + numToSetBitCorrect + ": " + correctlySetToOneExample + " (Binary: " + Integer.toBinaryString(correctlySetToOneExample) + ")");
//
//
//        // 4. Working with Binary Representations:
//        //    Understanding left shift helps in visualizing and manipulating the binary form of numbers, which is crucial in many low-level algorithms and data structures.
//
//        // 5. Potential for Overflow:
//        //    Be aware that left shifting can lead to overflow if the result exceeds the maximum value that the data type can hold. The bits shifted out on the left are lost.
//        int largeNum = Integer.MAX_VALUE;
//        System.out.println("Left shifting MAX_VALUE: " + (largeNum << 1)); // Result will likely be negative due to overflow.
    }
}
