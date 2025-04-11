package basics.nestedLoops.AdvancePatterns;

import java.util.Scanner;

/*

    print pattern


    *      *
    **    **
    ***  ***
    ********
    ********
    ***  ***
    **    **
    *      *


 */
public class ButterflyPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            //first stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //then spaces
            for(int j=1;j<=(2*(n-i));j++){
                System.out.print(" ");
            }
            //again stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }

        //2nd part

        for(int i=n;i>=1;i--){
            //first stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //then spaces
            for(int j=1;j<=(2*(n-i));j++){
                System.out.print(" ");
            }
            //again stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
