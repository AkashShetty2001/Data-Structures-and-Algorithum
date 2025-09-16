package Maths;

public class GCDOrHCF {
    public static void main(String[] args) {
        System.out.println(GCD(20,40));
        System.out.println(gcdOptimal(20,40));
    }
    public static  int GCD(int n1, int n2) {

        int min=Math.min(n1,n2);

        for(int i=min;i>=1;i--){
            if((n1%i==0) && (n2%i==0)){
                return i;
            }
        }

        return -1;

    }

    public static  int gcdOptimal(int n1, int n2){
        while(n1>0 && n2> 0){
            if(n1>n2){
                n1=n1%n2;
            }else{
                n2=n2%n1;
            }
        }
        if(n1==0) return n2;
        else return n1;
    }
}
/*
 * Brute-force GCD approach:
 * 1. Loop from min(n1, n2) down to 1.
 * 2. Return first i where (n1 % i == 0 && n2 % i == 0).
 *
 * Time Complexity: O(min(n1, n2))
 * Space Complexity: O(1)
 *
 * ⚡ Note: Avoid i = 0 to prevent division by zero error.
 *
 * 💡 Optimal Approach: Use Euclidean algorithm (O(log min(n1, n2)) time).
 */

/*
 * Optimal GCD using Euclidean Algorithm:
 * 1. Repeatedly apply: n1 = n1 % n2 or n2 = n2 % n1
 * 2. Stop when one becomes 0; the other is the GCD.
 *
 * Time Complexity: O(log min(n1, n2)) → Because numbers reduce quickly via modulo.
 * Space Complexity: O(1) → Constant extra space.
 *
 * 💡 Why min(n1, n2)?
 * Because the number of steps depends on how fast the smaller number reduces to 0.
 */


