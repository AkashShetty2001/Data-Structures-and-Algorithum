package hashing;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountingFrequencies {
    public static void main(String[] args) {
        int nums[]={ 1, 2, 2, 1, 3};
        System.out.println(countFrequencies(nums));
    }
    public  static List<List<Integer>> countFrequencies(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        // Your code goes here
        HashMap<Integer,Integer> hm= new HashMap<>();

        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }

        System.out.println(hm);
         for ( Map.Entry<Integer,Integer> entry:hm.entrySet()){
             ArrayList<Integer> a= new ArrayList<>();
             a.add(entry.getKey());
             a.add(entry.getValue());
             ans.add((a));
         }
        //System.out.println(ans);
        return ans;
    }
}
