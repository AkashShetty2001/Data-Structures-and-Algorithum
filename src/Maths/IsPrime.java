package Maths;

public class IsPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(6));
    }

    public static boolean isPrime(int n) {
        //your code goes here

        int count=0;

        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                if(n/i==i){
                    count++;
                }else{
                    count+=2;
                }
            }
        }
        return(count==2);
    }

}

/*
 * 1️⃣ Brute-force approach (Incorrect):
 * - Loops from 2 to n, counts number of divisors.
 * - Mistake: Incorrect logic and unnecessary counting.
 * - Not recommended.

 * 2️⃣ Optimized approach (Correct):
 * - Loop from 1 to √n.
 * - For every divisor pair (i, n/i), increment count accordingly.
 * - A prime has exactly 2 divisors: 1 and itself.
 * - Works correctly but can be simplified.

 * ✅ Best Practice (Recommended):
 * - If n <= 1 → Not prime.
 * - Loop from 2 to √n:
 *     If n % i == 0 → Not prime (return false).
 * - Else, return true.
 *
 * Time Complexity: O(√n)
 * Space Complexity: O(1)
 */

