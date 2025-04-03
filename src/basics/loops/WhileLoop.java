package basics.loops;

import java.util.Scanner;

/*

`while` loop:
    * The `while` loop is used when you don't know the number of iterations beforehand,
     and the loop continues as long as a specified condition is true.
    * Syntax:

    ```java
    while (condition) {
        // code to be executed
    }
    ```
 */
public class WhileLoop {
    public static void main(String[] args) {
        //* Example: Reading input until a specific value is entered.
        Scanner sc =new Scanner(System.in);
        int input=0;

        while(input != -1){
            System.out.println("Enter -1 to exit..");
            input=sc.nextInt();
            if(input == -1){
                System.out.println("good bye!!!");
            }
        }
    }

}
