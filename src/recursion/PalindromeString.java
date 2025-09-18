package recursion;

public class PalindromeString {
    public static void main(String[] args) {
        String s="abcdeedcba";
        int l=0;
        int r=s.length()-1;
        boolean ans= true;

        while(l<=r){
            if(s.charAt(l)!=s.charAt((r))){
                System.out.println("no palindrome");
                ans=false;
                break;
            }
            l++;
            r--;
        }
        System.out.println(ans);
        System.out.println(palindrome(s));

    }

    public static boolean palindrome(String s){
        return palindromeHelper(0,s.length()-1,s);
    }

    public static boolean palindromeHelper(int l, int r,String s){
        if(l>r){
            return true;
        }
        if(s.charAt(l)!=s.charAt(r)){ return false;}

         return palindromeHelper(l+1,r-1,s);
    }
}
