package recursion;

/*
Print name N times using recursion
 */
public class PrintName {
    public static void main(String[] args) {
        printNameHelper(5);
    }

    public static void printNameHelper(int n){
        if(n==1){
            System.out.println("Akash "+n);
            return;
        }

        printNameHelper(n-1);
        System.out.println("Akash "+n);// backtracking
    }
}
