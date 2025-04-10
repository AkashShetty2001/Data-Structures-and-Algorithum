package basics.loops;

/*
 `for` loop:
    * The `for` loop is used when you know the number of iterations in advance.
    * It consists of three parts: initialization, condition, and increment/decrement.
    * Syntax:

    ```java
    for (initialization; condition; increment/decrement) {
        // code to be executed
    }
    ```


 */
public class ForLoop {
    public static void main(String[] args) {
        // * Example: Printing numbers from 1 to 5.
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

    }
}
