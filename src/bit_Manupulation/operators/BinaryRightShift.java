package bit_Manupulation.operators;
/*
    a>>b
    move a by b places towards right

    imp formula
    (a/2^b)
 */

/*
    '>>' - Binary Right Shift Operator

    The right shift operator (`>>`) shifts the bits of the left operand (`a`) to the right by the number of positions specified by the right operand (`b`).

    There are two types of right shift:

    1.  **Arithmetic Right Shift (Sign-preserving):**
        - The most significant bit (sign bit) is copied into the vacated bit positions on the left. This preserves the sign of the original number. This is the most common type of right shift for signed integers in many programming languages.

    2.  **Logical Right Shift (Zero-fill):**
        - Zero bits are shifted in from the left. This is typically used for unsigned integers or when you want a purely bitwise shift without sign extension. In Java, the `>>>` operator performs a logical right shift.

    Visual Representation (for a = 6, b = 1, assuming arithmetic right shift):

    Original binary of a (6):  00000110
                                ^^^^^^^^
    Shift right by 1 (6 >> 1): 00000011  (Divided by 2, integer division)
                                0^^^^^^^

    Visual Representation (for a = -6 (represented in two's complement), b = 1, assuming arithmetic right shift):

    Binary of a (-6):          ...11111010
                                  ^^^^^^^^
    Shift right by 1 (-6 >> 1): ...11111101  (Divided by 2, integer division, sign preserved)
                                 1^^^^^^^^

    Important Formula (for integer division):
    Right shifting `a` by `b` positions is equivalent to integer division of `a` by 2 raised to the power of `b` ($a / 2^b$).
*/
public class BinaryRightShift {
    public static void main(String[] args) {
        int a = 6; // Binary: 00000110
        int b = 1;

        int result = a >> b; // 6 >> 1

        // Calculation: 6 / (2^1) = 6 / 2 = 3
        // Binary of 3: 00000011

        System.out.println(a + " >> " + b + " = " + result); // Output: 6 >> 1 = 3

//        int negativeA = -6; // Binary (32-bit two's complement): ...11111010
//        int shiftAmount = 1;
//        int negativeResult = negativeA >> shiftAmount; // -6 >> 1
//
//        // Calculation: -6 / (2^1) = -3
//        // Binary of -3 (32-bit two's complement): ...11111101
//
//        System.out.println(negativeA + " >> " + shiftAmount + " = " + negativeResult); // Output: -6 >> 1 = -3
//
//        // Important points for DSA problem solving using Right Shift:
//
//        // 1. Efficient Integer Division by Powers of 2:
//        //    Right shift provides a fast way to perform integer division by powers of 2.
//
//        int numToDivide = 16; // Binary: 00010000
//        int divideBy4 = numToDivide >> 2; // 16 / (2^2) = 4 (Binary: 00000100)
//        System.out.println(numToDivide + " >> 2 = " + divideBy4);
//
//        // 2. Extracting Bits:
//        //    Right shift can be used to move specific bits to the least significant position, where they can be easily checked using the AND operator with 1.
//
//        int value = 13; // Binary: 00001101
//        int bitAtIndex1 = (value >> 1) & 1; // Shift right by 1 (00000110), then AND with 1 to get the 1st bit (0)
//        System.out.println("Bit at index 1 of " + value + ": " + bitAtIndex1);
//
//        int bitAtIndex2 = (value >> 2) & 1; // Shift right by 2 (00000011), then AND with 1 to get the 2nd bit (1)
//        System.out.println("Bit at index 2 of " + value + ": " + bitAtIndex2);
//
//        // 3. Sign Extension (Arithmetic Right Shift):
//        //    For signed integers, arithmetic right shift preserves the sign. This is important when you want to maintain the numerical value (as integer division) for negative numbers.
//
//        // 4. Logical Right Shift (>>> in Java):
//        //    Use the logical right shift operator (`>>>` in Java) when you are working with unsigned values or when you explicitly want zero-filling from the left, regardless of the sign bit.
//
//        int unsignedNegative = -6;
//        int logicalShiftResult = unsignedNegative >>> 1;
//        System.out.println(unsignedNegative + " >>> 1 = " + logicalShiftResult);
        // The output will be a large positive number because the sign bit is treated as a regular bit and 0 is shifted in.

        // 5. Iterating Through Bits:
        //    Right shift can be used in loops to examine each bit of a number.
//
//        int n = 10; // Binary: 00001010
//        System.out.println("Bits of " + n + ":");
//        for (int i = 0; i < 8; i++) { // Assuming 8 bits for simplicity
//            if (((n >> i) & 1) == 1) {
//                System.out.println("Bit " + i + " is 1");
//            } else {
//                System.out.println("Bit " + i + " is 0");
//            }
//        }
    }
}
