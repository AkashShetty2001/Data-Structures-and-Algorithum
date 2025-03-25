package basics.variables_And_Datatypes.practice_Questions;

import java.util.Scanner;

/*
Write a program to input three numbers: A, B, and C.
You need to calculate and output the average of these three numbers.
 */
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values for the three variables");
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c= sc.nextInt();

        int average= (a+b+c)/3;
        System.out.println(average);
    }
}
