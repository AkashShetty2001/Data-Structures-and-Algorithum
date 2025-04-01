package basics.operators.practiceQuestions;

// Test.java (ii)
public class Question1 {
    public static void main(String[] args) {
        // Initialize variables
        int x = 2, y = 5;

        // Expression 1: (x * y / x)
        int exp1 = (x * y / x);

        // Expression 2: (x * (y / x))
        int exp2 = (x * (y / x));

        // Output the results of both expressions
        System.out.print(exp1 + " , ");  // exp1: 5
        System.out.print(exp2);          // exp2: 0
    }
}

