package basics.conditional_Statements.practiceQuestions;

import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter your marks");
        int marks=sc.nextInt();

        String res=(marks>=33)?"Pass":"Fail";
        System.out.println(res);
    }
}
