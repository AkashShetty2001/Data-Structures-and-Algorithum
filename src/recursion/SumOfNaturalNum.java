package recursion;

public class SumOfNaturalNum {
    public static void main(String args[]){
        int ans=sumHelper(5,0);
        System.out.println(ans);
    }
    public static int sumHelper(int n, int sum){
        if(n==0){
            return sum;
        }
        sum+=n;
       return sumHelper(n-1,sum);


    }
}

/*
 * 🔧 Key Concepts:
 * 1️⃣ Base Case: When n == 0, recursion ends and final sum is returned.
 * 2️⃣ Recursive Step: Add current n to sum, then call with (n-1).
 * 3️⃣ Flow:
 *    sumHelper(5,0) → sumHelper(4,5) → sumHelper(3,9) → sumHelper(2,12) → sumHelper(1,14) → sumHelper(0,15)
 *    Base case returns 15 → bubbles back up unchanged.
 *
 * Example Output:
 * Input: n = 5 → Output: 15
 *
 * ⏱ Time Complexity (TC): O(n)
 *    - n recursive calls (each reduces n by 1).
 *
 * 🧱 Space Complexity (SC): O(n)
 *    - Call stack depth = n.
 *
 * ✅ Important Insight:
 * • This is an example of **tail recursion** → recursive call is the last statement.
 * • Accumulator (`sum`) carries the partial result through the calls.
 * • Final answer flows from base case back up the call stack.
 */