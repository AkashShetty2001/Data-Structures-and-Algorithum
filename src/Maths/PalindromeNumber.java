package Maths;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
    public static  boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }

        long n=x;
        long rev=0;


        while(x!=0 ){
            int lastDigit=x%10;
            rev=rev*10+lastDigit;
            x=x/10;
        }
        System.out.println(rev);

        return (n==rev);

    }

    //Tc=O(log10 N +1) SC=o(1)
}
