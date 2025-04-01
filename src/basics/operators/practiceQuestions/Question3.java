package basics.operators.practiceQuestions;

public class Question3 {
    public static void main(String[] args) {
        // Initialize variables
        int x, y, z;
        x = y = z = 2;

        // Perform operations using assignment operators
        x += y;  // x = x + y, so x becomes 4
        y -= z;  // y = y - z, so y becomes 0
        z /= (x + y);  // z = z / (x + y), so z becomes 2 / (4 + 0) = 2 / 4 = 0 (integer division)

        // Output the result
        System.out.println(x + " " + y + " " + z);  // Output: 4 0 0
    }
}
