package basics.loops.practiceQuestion;

import java.util.Scanner;

public class PrintReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();

        while(n>0){
            int lastDigit=n%10; //extracting lastdigit
            System.out.print(lastDigit);
            n/=10;//removing last digit
        }

        System.out.println();
    }
}
