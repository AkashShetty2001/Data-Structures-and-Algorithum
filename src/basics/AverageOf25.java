package basics;

import java.util.Scanner;

public class AverageOf25 {
    public static void main(String[] args) {
        int a[]= new int[25];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks of 25 ...");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }

        System.out.println(sum/25);



    }
}
