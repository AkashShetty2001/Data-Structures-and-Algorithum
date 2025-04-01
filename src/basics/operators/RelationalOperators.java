package basics.operators;

public class RelationalOperators {
    public static void main(String[] args) {

        /*
        // The output of relational operators is a boolean value (true or false).
        // These operators are used to compare two operands and evaluate the relationship between them.

        ==  : Checks whether both operands have the same value (equality operator).
        !=  : Checks whether both operands do not have the same value (inequality operator).
        >   : Checks if the first operand (a) is greater than the second operand (b).
        <   : Checks if the first operand (a) is less than the second operand (b).
        >=  : Checks if the first operand (a) is greater than or equal to the second operand (b).
        <=  : Checks if the first operand (a) is less than or equal to the second operand (b).

        Relational operators always require two operands to compare.
         */

        // Declare two integer variables a and b
        int a = 10;
        int b = 5;

        // Check if a is equal to b
        System.out.println((a == b));  // Expected output: false (10 is not equal to 5)

        // Check if a is not equal to b
        System.out.println((a != b));  // Expected output: true (10 is not equal to 5)

        // Check if a is greater than b
        System.out.println((a > b));   // Expected output: true (10 is greater than 5)

        // Check if a is less than b
        System.out.println((a < b));   // Expected output: false (10 is not less than 5)

        // Check if a is greater than or equal to b
        System.out.println((a >= b));  // Expected output: true (10 is greater than 5)

        // Check if a is less than or equal to b
        System.out.println((a <= b));  // Expected output: false (10 is not less than or equal to 5)

        // DSA Insight:
        // In Data Structures and Algorithms (DSA), relational operators are often used to:
        // 1. Compare elements while traversing through data structures (like arrays, lists, etc.).
        // 2. Control loop conditions (e.g., determining if we should continue iterating).
        // 3. Perform comparisons in searching and sorting algorithms.

        // Example in DSA:
        // 1. **Sorting Algorithms**: During sorting, relational operators are used to compare elements to decide the order:
        //    - For example, in Bubble Sort, elements are compared using > or < to decide whether to swap them.
        // 2. **Searching Algorithms**: In Binary Search, relational operators are used to compare the search key with the middle element to decide which half of the array to continue searching in.

        // Example: Binary Search - This code snippet uses relational operators to search for an element in a sorted array:
        // int mid = low + (high - low) / 2;
        // if (arr[mid] == key) { return mid; }  // Checks if the middle element is the search key
        // else if (arr[mid] < key) { low = mid + 1; }  // If the middle element is smaller, move right
        // else { high = mid - 1; }  // If the middle element is larger, move left

        // Relational operators are essential in algorithmic design, as they help control the flow and decisions.
    }
}
