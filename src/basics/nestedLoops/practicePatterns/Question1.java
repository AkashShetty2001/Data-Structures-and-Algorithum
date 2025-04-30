package basics.nestedLoops.practicePatterns;
/*

    *****
    *****
    *****
    *****
    *****


    *
    **
    ***
    ****
    *****


    *****
    ****
    ***
    **
    *


 */

public class Question1 {
    public static void main(String[] args) {
        int n=5;
        pattern1(n);
        System.out.println("========================");
        pattern2(n);
        System.out.println("========================");
        pattern3(n);
    }

    private static void pattern1(int n) {

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void pattern2(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void pattern3(int n) {
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
