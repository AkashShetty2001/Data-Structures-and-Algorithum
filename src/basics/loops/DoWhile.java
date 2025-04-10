package basics.loops;

import java.util.Scanner;

/*
  `do-while` loop:
    * The `do-while` loop is similar to the `while` loop, but it guarantees that the code block is executed at least once, even if the condition is initially false.
    * Syntax:

    ```java
    do {
        // code to be executed
    } while (condition);
    ```
 */
public class DoWhile {
    public static void main(String[] args) {

        /*
         * Example: A simple menu driven program that always displays the menu at least once.
         */

//        Scanner sc = new Scanner(System.in);
//        int choice;
//        do{
//            System.out.println("1. option 1");
//            System.out.println("2. option 2");
//            System.out.println("3. exit ");
//            choice=sc.nextInt();
//        }while(choice !=3);

        int n=1;

        do{
            System.out.println("hello");
        }while(n!=1); //even though the condition is false in the first check, it executes atleast once..
    }
}
