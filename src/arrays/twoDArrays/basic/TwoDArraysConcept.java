package arrays.twoDArrays.basic;

import java.util.Scanner;

public class TwoDArraysConcept {
    public static void main(String[] args) {


        //creating 2d arrays in java, they are also called as matrix
        int matrix[][]= new int[3][3]; // []-> rows []-> columns
         //1. size of rows is mandatory
        //2. column size can vary , its called as jagged array in java


        // taking iput in 2d array
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the values : ");

        //matrix.length will give me no of rows
        for(int i=0;i<matrix.length;i++){
            //matrix[0].length will give the size of the 1st row
            for(int j=0;j<matrix[0].length;j++){
                //to access each cell,  cell is a box , rows * columns -> no of cells in matrix.
                matrix[i][j]=sc.nextInt();

            }
        }

        //printing each element in matrix.
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            //after printing each row
            System.out.println();
        }
    }
}
