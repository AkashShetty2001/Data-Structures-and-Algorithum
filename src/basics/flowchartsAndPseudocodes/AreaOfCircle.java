package basics.flowchartsAndPseudocodes;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of r");
        int radius=sc.nextInt();

        double pi=Math.PI;
        double area= pi * radius * radius;
        System.out.println("Area of circle is: "+ area);
    }
}
