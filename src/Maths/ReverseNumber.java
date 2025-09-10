package Maths;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(14444));
    }
    public  static int reverse(int x) {

        int rev=0;
        // System.out.println(Integer.MAX_VALUE);
        //    System.out.println(Integer.MIN_VALUE);
        //2147483647
        //-2147483648

        while(x!=0){
            int last=x%10;
            if(rev > Integer.MAX_VALUE/10 || rev == Integer.MAX_VALUE/10 && last >7){
                return 0;
            }

            if(rev < Integer.MIN_VALUE/10 || rev ==Integer.MIN_VALUE/10 && last < -8){
                return 0;
            }
            rev=rev*10+last;
            x=x/10;

        }
        return rev;

    }
}
