package basics.loops.practiceQuestion;

import java.util.Scanner;

/*
Write a program that reads a set of integers,
and then prints the sum of the even and odd integers
 */
public class PracticeQuestion2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int evenSum=0;
        int oddSum=0;

        do{
            System.out.println("Enter a number: ");
            number=sc.nextInt();

            if(number%2==0){
                evenSum+=number;
            }else{
                oddSum+=number;
            }

            System.out.println("eneter 1 to continue or 0 to end");
            choice=sc.nextInt();
        }while(choice==1);

        System.out.println("even sum is: "+ evenSum);
        System.out.println("odd sum is: "+ oddSum);
    }
}
