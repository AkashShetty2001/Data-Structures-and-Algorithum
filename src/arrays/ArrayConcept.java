package arrays;

import java.util.Arrays;
public class ArrayConcept {
    public static void main(String[] args) {

//        int a[]= new int[5];
//        String b[]= new String[5];
//
//
//        System.out.println(Arrays.toString(b));

        int c[]={1,7,2,3,4,5,6,7,8,9,10};

//        int max=Integer.MIN_VALUE;  //-infity
//        for(int i=0;i<c.length;i++){
//            if(c[i]>max){
//                max=c[i];
//            }
//        }
//
//        System.out.println(max);
//
//        int nums[]={1,2,33,3,4,22,5};
//
//        int fl=Integer.MIN_VALUE;
//        int sl=Integer.MIN_VALUE;
//
//        for(int i=0;i<nums.length;i++){
//            if(nums[i]>fl){
//                sl=fl;
//                fl=nums[i];
//            }
//
//            if(nums[i]>sl && nums[i]!=fl){
//                sl=nums[i];
//            }
//        }
//
//        System.out.println(sl);

        System.out.println(isSorted(c));

    }

    public static boolean isSorted(int a[]){
        for(int i=0;i<a.length-1;i++){
            if(a[i]>a[i+1]){
                return false;
            }
        }
        return true;
    }
}
