package basics.loops.practiceQuestion;

import java.util.Scanner;

/*
   get a  value or number from user until he enters multiple of 10..
 */
public class PracticeOnBreakStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        while(n%10!=0){
            System.out.println("its not multiple of 10, enter again");
            n=sc.nextInt();
            if(n%10==0){
                System.out.println("you have entered a multiple of 10");
                break;
            }
        }
    }
}
