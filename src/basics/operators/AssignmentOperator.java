package basics.operators;

public class AssignmentOperator {
    public static void main(String[] args) {

        /*
        Assignment operators are used to assign values to variables in different ways.
        These operators are shorthand for performing arithmetic operations on variables and then assigning the result back to the variable.

        =   : Basic assignment operator. It assigns the value on the right-hand side to the left-hand variable.
        +=  : Adds the right-hand operand to the left-hand variable and assigns the result to the left-hand variable.
        -=  : Subtracts the right-hand operand from the left-hand variable and assigns the result to the left-hand variable.
        *=  : Multiplies the left-hand variable by the right-hand operand and assigns the result to the left-hand variable.
        /=  : Divides the left-hand variable by the right-hand operand and assigns the result to the left-hand variable.
        %=  : Takes the modulus of the left-hand variable by the right-hand operand and assigns the result to the left-hand variable.

        These operators are frequently used in situations where the value of a variable needs to be updated based on its current value.
         */

        // Initialize variable 'a' to 10
        int a = 10;

        // Assignment and arithmetic operations:

        // += operator: a = a + 5
        System.out.println(a += 5);  // a becomes 15 (10 + 5)

        // -= operator: a = a - 5
        System.out.println(a -= 5);  // a becomes 10 (15 - 5)

        // *= operator: a = a * 5
        System.out.println(a *= 5);  // a becomes 50 (10 * 5)

        // /= operator: a = a / 5
        System.out.println(a /= 5);  // a becomes 10 (50 / 5)

        // %= operator: a = a % 5
        System.out.println(a %= 5);  // a becomes 0 (10 % 5)
    }
}
