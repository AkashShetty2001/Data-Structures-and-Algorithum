package recursion;

/*Understand recursion by print something N times*/
public class Recursion1 {
    public static void main(String[] args) {
        recursion1Helper(10);
    }

    public static void recursion1Helper(int n){
        if(n==0){ // base case to terminate the recursive call
            System.out.println(n);
            return ;
        }

        System.out.println((n));// work to be done
        recursion1Helper(n-1);// recursive call
    }
}
