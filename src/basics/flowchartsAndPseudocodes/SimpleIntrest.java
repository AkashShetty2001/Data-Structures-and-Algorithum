package basics.flowchartsAndPseudocodes;

import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal amount");
        double p=sc.nextDouble();
        System.out.println("Enter rate amountr");
        double r=sc.nextDouble();
        System.out.println("Enter Time amountr");
        double t=sc.nextDouble();

        double si= (p*r*t)/100;

        System.out.println("Simple intrest is :"+ si);

    }
}
