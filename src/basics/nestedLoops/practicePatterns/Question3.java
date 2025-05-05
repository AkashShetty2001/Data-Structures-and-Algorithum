package basics.nestedLoops.practicePatterns;

/*
    print pattern

    6    *
        **
       ***
      ****
     *****

 7   *****
      ****
       ***
        **
         *


8.      *
       ***
      *****
     *******
    *********


9.  *********
     *******
      *****
       ***
        *


10.      *
        * *
       * * *
      * * * *
     * * * * *
 */
public class Question3 {
    public static void main(String[] args) {
        int n=5;
        p1(n);
        System.out.println("================");
        p2(n);
        System.out.println("================");
        p3(n);
        System.out.println("================");
        p4(n);
        System.out.println("================");
        p5(n);

    }

    private static void p5(int n) {
        for(int i=1;i<=n;i++){

            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*"+" " );
            }

            //line break
            System.out.println();
        }

    }

    private static void p4(int n) {
        for(int i=n;i>=1;i--){

            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }

            //line break
            System.out.println();
        }
    }

    private static void p3(int n) {
        for(int i=1;i<=n;i++){

            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }

            //line break
            System.out.println();
        }
    }

    private static void p2(int n) {
        for(int i=n;i>=1;i--){

            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            //after each line i need next line
            System.out.println();
        }
    }

    private static void p1(int n) {
        for(int i=1;i<=n;i++){

            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            //after each line i need next line
            System.out.println();
        }
    }

}
