package basics.loops.practiceQuestion;

import java.util.Scanner;

/*
  print numbers that are enetred by user if it's not multiple of 10
 */
public class ContinueStatementExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i=1;

        do{
            System.out.println("enter a number: ");
            int n=sc.nextInt();
            i++;

            if(n %10 == 0){
                continue;
            }

            System.out.println("number was: "+n);

        }while(i<=10);



    }
}
