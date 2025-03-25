package basics.variables_And_Datatypes;

public class TypePromotion {
    public static void main(String[] args) {
        // Type Promotion in Expressions in Java
        // Type promotion refers to the automatic conversion of a smaller data type to a larger one during arithmetic operations.
        // It occurs when different types are mixed in an expression.

        // Rule 1: If any operand is a `long`, `double`, or `float`, the other operand(s) will be promoted to the same type.

        byte a = 10;     // byte
        short b = 20;    // short
        int c = 30;      // int
        long d = 40L;    // long
        float e = 50.5f; // float
        double f = 60.5; // double

        // Type promotion occurs here:
        // The result of the following operations will follow the rules of type promotion.

        // If a byte and a short are mixed with an int, the smaller types (byte, short) will be promoted to int:
        int result1 = a + b;  // byte + short -> promoted to int
        System.out.println("Result of byte + short (promoted to int): " + result1); // Output: 30

        // If an int and a long are mixed, the result will be promoted to long:
        long result2 = c + d;  // int + long -> promoted to long
        System.out.println("Result of int + long (promoted to long): " + result2); // Output: 70

        // If a float and an int are mixed, the result will be promoted to float:
        float result3 = c + e;  // int + float -> promoted to float
        System.out.println("Result of int + float (promoted to float): " + result3); // Output: 80.5

        // If double is involved, all smaller types are promoted to double:
        double result4 = e + f;  // float + double -> promoted to double
        System.out.println("Result of float + double (promoted to double): " + result4); // Output: 111.0

        // Rule 2: The result of an arithmetic operation will have the type of the largest operand involved in the operation.
        // For example, the largest type between int, float, and double will be used for the result.

        // Example: A mix of int and double
        double result5 = c + f;  // int + double -> promoted to double
        System.out.println("Result of int + double (promoted to double): " + result5); // Output: 90.5

        // Summary of Type Promotion in Expressions:
        // 1. **Type Promotion** occurs when smaller data types (e.g., byte, short, int) are used in expressions involving larger data types (e.g., long, float, double).
        //    - Smaller types are automatically promoted to the larger type during calculations.
        //    - For example, when mixing int and double in an expression, the result will be of type double.

        // 2. **Rule of Largest Operand**: The result of an expression takes the type of the largest operand involved.
        //    - Example: If you mix `int` and `double`, the result will be `double` because `double` is the larger type.

        // Always be aware of type promotion to avoid unexpected results or loss of precision, especially when working with floating-point numbers and integers.
    }
}
