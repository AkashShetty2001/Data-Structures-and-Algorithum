package basics.loops.practiceQuestion;

import java.util.Scanner;

public class PrintNumbersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "please enter the range");
        int range= sc.nextInt();

        int counter=1;

        while(counter<=range){
            System.out.print(counter+" ");
            counter++;
        }
        System.out.println();

    }
}
