package basics.nestedLoops.practicePatterns;

/*

    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5

    *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *

 */
public class Question2 {
    public static void main(String[] args) {
        int n=5;
        pattern1(n);
        System.out.println(" =============================== ");
        pattern2(n);

    }
    public static void pattern1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n){

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }



        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
