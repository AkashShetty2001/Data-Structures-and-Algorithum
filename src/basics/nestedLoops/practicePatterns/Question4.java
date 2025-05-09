package basics.nestedLoops.practicePatterns;

/*
    print pattern

11.  * * * * *
      * * * *
       * * *
        * *
         *


12.  * * * * *
      * * * *
       * * *
        * *
         *
         *
        * *
       * * *
      * * * *
     * * * * *


13.      *
        * *
       *   *
      *     *
     *********


14.  *********
      *     *
       *   *
        * *
         *


15.      *
        * *
       *   *
      *     *
     *       *
      *     *
       *   *
        * *
         *

 */
public class Question4 {
    public static void main(String[] args) {
        int n=5;
        q1(n);
        System.out.println("=====================");
        q2(n);
        System.out.println("=====================");
        q3(n);
        System.out.println("=====================");
        q4(n);
        System.out.println("=====================");
        q5(n);

    }

    private static void q5(int n) {

        //upper part
        for(int i=1;i<n;i++){

            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }


            //stars
            if(i==1){
                System.out.print("*");
//            }else if(i==n){
//                int k=2*n-1;
//                for(int j=1;j<=k;j++){
//                    System.out.print("*");
//                }
            }else{
                System.out.print("*");

                int m=(2*i)-3;
                for(int j=1;j<=m;j++){
                    System.out.print(" ");
                }

                System.out.print("*");
            }

            //line break
            System.out.println();

        }

        //lower part
        for(int i=n;i>=1;i--){

            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }


            //stars
            if(i==1){
                System.out.print("*");
//            }else if(i==n){
//                int k=2*n-1;
//                for(int j=1;j<=k;j++){
//                    System.out.print("*");
//                }
            }else{
                System.out.print("*");

                int m=(2*i)-3;
                for(int j=1;j<=m;j++){
                    System.out.print(" ");
                }

                System.out.print("*");
            }

            //line break
            System.out.println();

        }
    }

    private static void q4(int n) {
        for(int i=n;i>=1;i--){

            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }


            //stars
            if(i==1){
                System.out.print("*");
            }else if(i==n){
                int k=2*n-1;
                for(int j=1;j<=k;j++){
                    System.out.print("*");
                }
            }else{
                System.out.print("*");

                int m=(2*i)-3;
                for(int j=1;j<=m;j++){
                    System.out.print(" ");
                }

                System.out.print("*");
            }

            //line break
            System.out.println();

        }
    }

    private static void q3(int n) {

        for(int i=1;i<=n;i++){

            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }


            //stars
            if(i==1){
                System.out.print("*");
            }else if(i==n){
                int k=2*n-1;
                for(int j=1;j<=k;j++){
                    System.out.print("*");
                }
            }else{
                System.out.print("*");

                int m=(2*i)-3;
                for(int j=1;j<=m;j++){
                    System.out.print(" ");
                }

                System.out.print("*");
            }

            //line break
            System.out.println();

        }
    }

    private static void q2(int n) {

        //upper part
        for(int i=n;i>=1;i--){

            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }

            //line break
            System.out.println();

        }

        //lowerpart
        for(int i=1;i<=n;i++){

            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }

            //line break
            System.out.println();

        }
    }

    private static void q1(int n) {
        for(int i=n;i>=1;i--){

            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }

            //line break
            System.out.println();

        }
    }
}
