package basics.variables_And_Datatypes.practice_Questions;
/*
Write a program that accepts the cost of three items from the user using float data type:

A pencil

A pen

An eraser

You need to output the total cost of the items back to the user as their bill.

Add-on (Advanced Problem):
You can also try adding 18% GST tax to the total cost of the items and display the final bill with the tax included.


 */

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost of pencil, pen and eraser");
        float pencil=sc.nextFloat();
        float pen=sc.nextFloat();
        float eraser=sc.nextFloat();

        float totalBill=pen+pen+eraser;

        System.out.println("total bill is:"+ totalBill);

        float totalBillWithtax = (0.18f * totalBill)+ totalBill;

        System.out.println("total bill the 18% tax :"+ totalBillWithtax);
    }
}
