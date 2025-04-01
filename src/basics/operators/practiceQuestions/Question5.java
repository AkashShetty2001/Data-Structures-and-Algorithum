package basics.operators.practiceQuestions;

public class Question5 {
    public static void main(String[] args) {
        // Initialize variables
        int x = 10, y = 5;

        // Calculate the first expression
        int exp1 = (y * (x / y + x / y));  // exp1: (5 * (10 / 5 + 10 / 5)) -> 5 * (2 + 2) -> 5 * 4 = 20

        // Calculate the second expression
        int exp2 = (y * x / y + y * x / y);  // exp2: (5 * 10 / 5 + 5 * 10 / 5) -> 10 + 10 = 20

        // Output both expressions
        System.out.println(exp1);  // Output: 20
        System.out.println(exp2);  // Output: 20
    }
}

