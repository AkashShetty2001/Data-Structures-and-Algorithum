package basics.conditional_Statements.practiceQuestions;

import java.util.Scanner;

public class LargestOf3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the values of 3 numbers");
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c= sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println("largest is :"+ a);
        }else if(b>=c){
            System.out.println("largest is :"+ b);
        }else{
            System.out.println("largest is :"+ c);
        }
    }
}
