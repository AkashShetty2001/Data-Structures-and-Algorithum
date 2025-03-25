package basics.variables_And_Datatypes;

public class TypeCasting {
    public static void main(String[] args) {
        // Explicit Type Casting (also known as Narrowing Conversion)
        // Type casting is the process of converting one data type into another.
        // This example demonstrates explicit casting (narrowing conversion), where a larger type is converted to a smaller type.

        // We start with a float variable 'x'
        float x = 100.23f;  // 'x' holds a float value (100.23)

        // Now we explicitly cast 'x' (float) to an int using (int)
        // The fractional part (".23") will be lost, and only the integer part (100) will be retained.
        int z = (int) x;  // Explicitly cast the float value 'x' to an integer 'z'

        // Print the result, which will be the integer part of 'x' (100)
        System.out.println(z);  // Output: 100

        // Explanation:
        // In this case, we're manually forcing the type conversion from float (larger) to int (smaller).
        // The fractional part of the float is truncated during the conversion to int (not rounded).
        // Explicit casting is necessary when converting from a larger type to a smaller one to avoid data loss.

        // Summary of Type Casting Concepts:
        // - **Explicit (Narrowing) Casting**: When converting a larger type (e.g., float, double) to a smaller type (e.g., int, byte).
        //   This requires explicit casting and can result in data loss (e.g., truncation of decimal places in this case).
        // - **Data Loss**: Be cautious of losing important data when performing type casting, especially when converting floating-point numbers to integers.
    }
}
