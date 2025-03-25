package basics.variables_And_Datatypes.practice_Questions;

import java.util.Scanner;

/*
Question2:In a program,input the side of a square.
You have to output the area of the square.(Hint : area of a square is (side x side)
 */
public class Question2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of a square");
        double side=sc.nextDouble();

        System.out.println("Area of a square is :"+ (side * side));

    }
}
