package basics.flowchartsAndPseudocodes;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n= sc.nextInt();

        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }

        //formula method
        int sum2= (n*(n+1))/2;

        System.out.println(sum);
        System.out.println(sum2);
    }
}
