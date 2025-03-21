package basics;

import java.util.Scanner;

public class GreatestAmong2 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);

        System.out.println("Enter 2 numbers");
        int n1= sc.nextInt();
        int n2= sc.nextInt();

        if(n1>n2){
            System.out.println("greatest "+n1);
        }else{
            System.out.println("greatest "+n2);
        }


    }
}
