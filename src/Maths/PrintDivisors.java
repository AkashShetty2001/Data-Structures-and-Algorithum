package Maths;

/*
print all the divisors.
 */
public class PrintDivisors {
    public static void main(String[] args) {
      printDivisors(36);
        System.out.println();
      optimalPrintDivisor(36);
    }

    public  static void printDivisors(int m){
        for(int i=1;i<=m;i++){
            if(m%i==0){
                System.out.print(i+" ");
            }
        }
    }

    public static void optimalPrintDivisor(int m){
        for(int i=1;i*i<=m;i++){
            if(m%i==0){
                System.out.print(i+" ");

                if(m/i != i){
                    System.out.print(m/i+" ");
                }
            }
        }
    }
}


/*
 * Brute-force approach to print all divisors of a number m:
 * 1. Iterate i from 1 to m.
 * 2. Check if i divides m exactly (m % i == 0).
 * 3. If yes, print i (it’s a divisor).
 *
 * Time Complexity: O(m) → Because we loop from 1 to m
 * Space Complexity: O(1) → Only constant extra space used
 *
 * Example:
 * Input: m = 6
 * Output: 1 2 3 6
 */


