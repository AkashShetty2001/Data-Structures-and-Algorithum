package basics.operators.practiceQuestions;

// Test.java (ii) - second part
public class Question2 {
    public static void main(String[] args) {
        // Initialize variables
        int x = 200, y = 50, z = 100;

        // First condition check
        if (x > y && y > z) {
            System.out.println("Hello");
        }

        // Second condition check
        if (z > y && z < x) {
            System.out.println("Java");
        }

        // Third condition check
        if ((y + 200) < x && (y + 150) < z) {
            System.out.println("Hello Java");
        }
    }
}

