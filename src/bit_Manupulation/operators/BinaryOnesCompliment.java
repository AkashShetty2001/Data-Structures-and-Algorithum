package bit_Manupulation.operators;

/*
    '~' - Binary NOT (Ones' Complement) Operator

    The NOT operator performs a bitwise complement operation.
    It inverts each bit of its operand. If a bit is 0, it becomes 1, and if it's 1, it becomes 0.

    Truth Table:
    ~0 = 1
    ~1 = 0

    Important Note: The result of the NOT operator on a signed integer depends on how negative numbers are represented in the system (typically two's complement).
*/
public class BinaryOnesCompliment {
    public static void main(String[] args) {
        int num = 5; // Binary representation (32-bit): 00000000 00000000 00000000 00000101

        // Applying the NOT operator:
        // ~00000000 00000000 00000000 00000101
        // = 11111111 11111111 11111111 11111010

        // When this result is interpreted as a signed 32-bit integer (using two's complement),
        // the leading '1' indicates a negative number. To find its decimal value:

        // 1. Take the two's complement of the result:
        //    a. Invert the bits: 00000000 00000000 00000000 00000101
        //    b. Add 1:                 00000000 00000000 00000000 00000110 (which is decimal 6)

        // 2. Apply the negative sign: -6

        System.out.println(~num); // Output will be -6

        // Important points for DSA problem solving using NOT:

        // 1. Creating masks with specific bits cleared:
        //    You can use NOT in conjunction with other bitwise operators to create masks where certain bits are 0.
//        int allOnes = ~0; // All bits set to 1 (e.g., -1 in signed 32-bit)
//        int maskWithBitClear = ~(1 << 2); // Creates a mask with the 2nd bit (0-indexed) as 0 and all others as 1.
//
//        int value = 13; // Binary: ...00001101
//        int result = value & maskWithBitClear; // Clears the 2nd bit of 'value'
//        System.out.println("Clearing 2nd bit of " + value + " using NOT: " + result); // Output: 9 (Binary: ...00001001)
//
//        // 2. Be mindful of signed integer representation:
//        //    The behavior of the NOT operator on signed integers can sometimes be counter-intuitive if you don't understand two's complement. The result will always be the bitwise inverse, but its decimal interpretation depends on the signed representation.
//
//        // 3. Using NOT to check for all bits being unset:
//        //    If a variable 'x' has all its bits as 0, then ~x will have all its bits as 1 (which is typically -1 in signed representation). You can use this for certain conditional checks.
//
//        int zeroValue = 0;
//        if (~zeroValue == -1) {
//            System.out.println("~0 equals -1 (in typical signed 32-bit representation)."); // Output will likely be this.
//        }
//
//        // 4. Interplay with other operators:
//        //    NOT is often used in combination with AND and OR to achieve specific bit manipulations, like creating specific bit patterns or isolating ranges of bits.
    }
}