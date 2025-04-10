package basics.loops.practiceQuestion;

import java.util.Scanner;

public class FactorialOfGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int fact=1;
        for(int i=n;i>=1;i--){
            fact*=i;
        }

        System.out.println("factorial of given number "+n+" is "+ fact );
    }
}
