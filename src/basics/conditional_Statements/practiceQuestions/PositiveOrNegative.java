package basics.conditional_Statements.practiceQuestions;

import java.util.Scanner;

/*
Write a Java program to get a number from the user
and print whether it is positive or negative.
 */
public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num= sc.nextInt();

        if(num >= 0){
            System.out.println("Positive");
        }else{
            System.out.println("Negative");
        }
    }
}
