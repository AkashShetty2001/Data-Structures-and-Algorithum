package basics.operators;

public class LogicalOperator {
    public static void main(String args[]) {

        /*
        Logical operators are used to combine multiple boolean expressions or conditions.
        These operators return a boolean result (true or false).

        && (Logical AND): Both expressions must be true for the result to be true.
        || (Logical OR): At least one of the expressions must be true for the result to be true.
        ! (Logical NOT): Reverses the boolean value. If the result is false, it will return true, and vice versa.

        These operators help in decision-making processes where multiple conditions need to be checked.
        It requires 2 operands (except for NOT, which only requires 1 operand).
         */

        // Example 1: Logical AND (&&)
        // Both conditions (3 > 2) and (1 > 7) need to be true for the result to be true.
        // (3 > 2) is true, but (1 > 7) is false, so the result is false.
        System.out.println((3 > 2) && (1 > 7));  // Expected output: false

        // Example 2: Logical OR (||)
        // At least one condition must be true for the result to be true.
        // (3 > 2) is true, and (1 > 7) is false, so the result is true because the OR operator needs only one condition to be true.
        System.out.println((3 > 2) || (1 > 7));  // Expected output: true

        // Example 3: Logical NOT (!)
        // The NOT operator reverses the result.
        // (3 > 2) && (1 > 7) gives false, so applying ! will give the opposite, which is true.
        System.out.println(!((3 > 2) && (1 > 7)));  // Expected output: true

        // DSA Insight:
        // Logical operators are extremely useful in algorithmic design, particularly when working with conditions
        // in loops, searching algorithms, and decision-making structures.

        // Example in DSA:
        // 1. **Loops**: Logical operators can be used to combine multiple conditions in a loop's termination condition:
        //    - While traversing through an array, we may need to check multiple conditions:
        //      ```java
        //      while (i < n && arr[i] != target) {
        //          // process array elements
        //          i++;
        //      }
        //      ```
        // 2. **Search and Decision Making**: Logical operators are used in algorithms like Binary Search or BFS/DFS where multiple conditions need to be checked before proceeding.
        //    For example, in BFS:
        //    ```java
        //    if (currentNode != null && !visited[currentNode]) {
        //        // Visit the node and continue processing
        //    }
        //    ```

        // Logical operators are key to writing efficient, readable, and powerful algorithms, especially when handling complex conditions or branching logic in DSA.
    }
}
