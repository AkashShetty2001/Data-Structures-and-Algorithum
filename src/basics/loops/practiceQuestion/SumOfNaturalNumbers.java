package basics.loops.practiceQuestion;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();

        int sum=0;
        int counter=1;

        while(counter<=n){
            sum=sum+counter;
            counter++;
        }

        System.out.println(sum);
    }
}
