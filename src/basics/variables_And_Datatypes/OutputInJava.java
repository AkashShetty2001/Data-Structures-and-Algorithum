package basics.variables_And_Datatypes;

public class OutputInJava {
    public static void main(String[] args) {
        // 'System' is a built-in class in Java that provides access to system resources like standard input, output, and error streams.
        // It is part of the java.lang package, which is automatically imported into every Java program.

        // 'out' is a static member of the 'System' class. It represents the standard output stream (typically the console).
        // 'out' is of type 'PrintStream', which provides methods like print() and println() for outputting text to the console.

        // 'print' is a method of the 'PrintStream' class that prints text to the console without moving the cursor to the next line.
        // It means that after printing the text, the cursor stays on the same line, and the next output will continue on the same line.
        System.out.print("Output in Java, without moving cursor to next line.\n");

        // 'println' is another method of the 'PrintStream' class that prints text to the console and **automatically** moves the cursor to the next line.
        // The 'ln' stands for "line," indicating that a new line will be printed after the output.
        System.out.println("Hello World");

        // Alternatively, you can use the '\n' character in 'print' to manually move the cursor to the next line.
        // The '\n' is a special escape sequence in Java that represents a new line.
        System.out.print("Alternative way to move cursor to next line using \n");
    }
}
