package hashing;

import java.util.HashSet;
import java.util.Iterator;

public class CountUnqiueElements {
    public static void main(String[] args) {
        int nums[]={1,1,1,1,1,1,2,2,3,4,5,6,6,6,67,8,9,0,10,11};

        HashSet<Integer> hs= new HashSet<>();

        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }

        System.out.println("no of unique elements:"+hs.size());

       Iterator iterator =hs.iterator();
       while(iterator.hasNext()){
           System.out.print(iterator.next()+" ");
       }

    }


}
