package basics.operators;

public class OperatorPrecedence {
    public static void main(String[] args) {

        /*
        Operator precedence determines the order in which operators are evaluated in an expression.
        Operators with higher precedence are evaluated before those with lower precedence.
        In case operators have the same precedence, associativity rules determine the order of evaluation.

        Common operator precedence order (from highest to lowest):
        1. Parentheses `()` - used to explicitly specify the order of evaluation.
        2. Unary operators `++`, `--`, `+`, `-`, `!` (post and pre-increment/decrement, unary plus and minus, logical NOT).
        3. Multiplication `*`, Division `/`, Modulo `%`.
        4. Addition `+`, Subtraction `-`.
        5. Relational operators `<`, `>`, `<=`, `>=`, `==`, `!=`.
        6. Logical operators `&&` (AND), `||` (OR).
        7. Assignment operators `=`, `+=`, `-=`, `*=`, `/=`, `%=`.

        When multiple operators of the same precedence appear, the evaluation proceeds from **left to right** (left-associative).
        */

        // Example expression with multiplication, division, and modulo
        // Operator precedence ensures that * / and % are evaluated from left to right as they have the same precedence.

        System.out.println(3 * 3 / 4 % 3);  // Output: 2
    }
}
