package recursion;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        reverse(a);
        System.out.println(Arrays.toString(a));
        reverseRecursive(a);
        System.out.println(Arrays.toString(a));
    }
    public static void reverse(int a[]){
        int l=0;
        int r=a.length-1;

        while(l<=r){
            int temp=a[l];
            a[l]=a[r];
            a[r]=temp;

            l++;
            r--;
        }
    }

    public static void reverseRecursive(int a[]){
        reverseHelper(a,0,a.length-1);
    }
    public static void reverseHelper(int a[],int l,int r){
        if(l>r){
            return;
        }

        int temp=a[l];
        a[l]=a[r];
        a[r]=temp;

        reverseHelper(a,l+1,r-1);

    }
}
// Reverse an Array - Iterative + Recursive

// ✅ Iterative Approach (Optimal in practice)
// - Use two pointers: left (l), right (r).
// - Swap elements at l and r, then move l++, r-- until they cross.
// - TC = O(n)  → each element is visited once
// - SC = O(1)  → in-place, no extra memory

// ✅ Recursive Approach (Elegant, but higher space)
// - Base case: if l > r, stop recursion.
// - Work: swap a[l] and a[r].
// - Recursive step: call reverseHelper(a, l+1, r-1).
// - TC = O(n)  → one call per element
// - SC = O(n)  → due to call stack frames

// 🔑 Intuition:
// - Each recursive call handles ONE pair swap (first & last).
// - Problem shrinks in size → reverse the smaller subarray.
// - Once l crosses r → array fully reversed.

// ⚡ Interview Tip:
// - First explain iterative (optimal SC).
// - Then mention recursive (good for recursion practice, but extra O(n) space).
// - Always give TC & SC to show depth.

