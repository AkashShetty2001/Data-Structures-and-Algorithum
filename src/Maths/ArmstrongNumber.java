package Maths;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(armstrongNumber(1636));
    }
    public static boolean armstrongNumber(int n) {
        // code here

        int count=(int)Math.log10(n)+1;

        int sum=0;
        int dup=n;
        while(n>0){
            int last=n%10;
            sum=sum+(int)Math.pow(last,count);
            n=n/10;
        }

        return(sum==dup);
    }
}

