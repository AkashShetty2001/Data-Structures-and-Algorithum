package basics.variables_And_Datatypes;

public class TypeConversion {
    public static void main(String[] args){
        // Implicit type conversion (also known as widening conversion)
        // In implicit conversion, data is automatically converted to a larger type.
        // The following types can be implicitly converted in Java:
        // byte -> short -> int -> long -> float -> double

        int aa = 10;  //  is an integer (int) variable
        long b = aa;  //  is automatically converted to a long type due to implicit conversion
        System.out.println(b);  // The value of 'a' (10) is printed as a long (10L)

        // Example of a type mismatch and how conversion may not be possible:
       // long c = 20;  // 'c' is a long type variable

        // Uncommenting the next two lines would cause an error
        // int d = c;  // This line will give an error because you cannot implicitly convert from long to int
        // System.out.println(d);  // This would print the value of 'd' if the conversion were valid

        // Implicit conversion works only when the destination type can hold all the values of the source type.
        // In this case, 'long' has a larger range than 'int', so conversion from int to long is safe and happens automatically.
        // However, converting from 'long' to 'int' would lead to potential loss of data (if the long value exceeds the range of int),
        // which is why it's not allowed implicitly.

        // Summary of Type Conversion Concepts:
        // - Implicit (widening) conversion occurs when a smaller type is automatically promoted to a larger type.
        // - Explicit (narrowing) conversion is required when a larger type is manually converted to a smaller type (e.g., long to int).
        // - Always be cautious about potential data loss when performing explicit type conversions.
    }
}
