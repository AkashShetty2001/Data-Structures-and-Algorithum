package Maths;

/*
Problem Statement: Given an integer N, return the number of digits in N.
 */
public class CountDigits {
    public static void main(String[] args) {
        System.out.println(countDigit(12345));

        //optimal approach
        System.out.println((int)Math.log10(12345)+1);
        //Math.log(10) will give u the number of digit i am adding + 1 if it's a multiple of 10
    }

    public static int countDigit(int n){
        int count =0;
        int dup=n;
        while(dup>0){
            count++;
            int lastDigit=dup%10;//last digit extraction
            dup/=10; // digit reduction
        }
        return count;
    }

}
