package basics.nestedLoops;

public class CharacterPattern {
    public static void main(String[] args) {
        /*
        print pattern

        A
        BC
        DEF
        GHIJ

         */

        char c = 'A'; // Initialize the starting character.

        // Outer loop: Iterates through each line (4 lines).
        for (int i = 1; i <= 4; i++) {

            // Inner loop: Prints characters for the current line.
            // The number of characters increases with each line.
            for (int j = 1; j <= i; j++) {
                System.out.print(c++); // Print the current character and then increment it.
            }

            System.out.println(); // Move to the next line after printing characters.
        }

        /*
         * Logic Summary:
         * This program uses nested loops to print a character pattern.
         * The outer loop controls the number of rows (lines).
         * The inner loop controls the number of characters printed in each row.
         * A character variable 'c' is initialized to 'A' and is incremented
         * and printed in the inner loop. This ensures that each subsequent
         * character in the pattern is the next letter in the alphabet.
         * The number of characters printed in each row is equal to the current
         * row number, creating the triangular shape.
         */
    }
}