package bit_Manupulation.operators;

/*
    '|' - Binary OR (Inclusive OR) Operator

    The OR operator compares corresponding bits of two operands.
    The result bit is 1 if at least one of the corresponding bits of the two operands is 1; otherwise, it's 0.

    Truth Table:
    0 | 0 = 0
    1 | 0 = 1
    0 | 1 = 1
    1 | 1 = 1
*/
public class BinaryOR {
    public static void main(String[] args) {
        // Binary representation of 5: 0101
        // Binary representation of 6: 0110
        // 5 | 6:
        //   0101
        // | 0110
        // ------
        //   0111  (which is decimal 7)
        System.out.println(5 | 6); // Output: 7

        // Important points for DSA problem solving using OR:

        // 1. Setting a specific bit:
        //    To set the i-th bit of a number 'n' to 1, you can use the OR operator with a mask that has the i-th bit set.
//        int n = 5;      // Binary: 0101
//        int i = 1;      // Set the 1st bit (0-indexed)
//        int mask = 1 << i; // Binary: 0010
//        int result = n | mask; // 0101 | 0010 = 0111 (decimal 7)
//        System.out.println("Setting " + i + "-th bit of " + n + " results in: " + result);
//
//        // 2. Combining bitmasks (representing sets of flags):
//        //    If you have multiple bitmasks representing different sets of properties, you can combine them using OR.
//        int hasReadPermission = 1 << 0;   // Binary: 0001
//        int hasWritePermission = 1 << 1;  // Binary: 0010
//        int hasExecutePermission = 1 << 2; // Binary: 0100
//
//        int userPermissions = hasReadPermission | hasWritePermission; // 0001 | 0010 = 0011 (Read and Write)
//        System.out.println("User permissions: " + Integer.toBinaryString(userPermissions)); // Output: 11
//
//        int adminPermissions = hasReadPermission | hasWritePermission | hasExecutePermission; // 0001 | 0010 | 0100 = 0111 (Read, Write, and Execute)
//        System.out.println("Admin permissions: " + Integer.toBinaryString(adminPermissions)); // Output: 111
//
//        // 3. Checking if at least one of the conditions is true (when bits represent boolean flags):
//        //    If a bit is set, it can represent a true condition. ORing multiple such values will be non-zero if at least one condition is true.
//        boolean isFilePresent = (1 << 0) != 0; // Assume bit 0 represents file presence
//        boolean isNetworkConnected = (1 << 1) != 0; // Assume bit 1 represents network connection
//
//        int status = (isFilePresent ? (1 << 0) : 0) | (isNetworkConnected ? (1 << 1) : 0);
//
//        if ((status & (hasReadPermission | hasWritePermission)) != 0) {
//            System.out.println("Either read or write permission is available (or both).");
       // }
    }
}