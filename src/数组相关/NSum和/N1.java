package 数组相关.NSum和;
import java.util.*;
public class N1 {
    public int[] twoSum(int[] nums, int target) {
        if(nums.length==0) return new int[2];
        /** Arrays.sort(nums);
         int l=0;
         int r=nums.length-1;
         int[] res = new int[2];
         while(l<r){
         if(nums[l]+nums[r]==target){
         res=new int[]{l,r};
         return res;
         }else if(nums[l]+nums[r]>target){
         r--;
         }else{
         l++;
         }
         }
         return res;**/
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int complement = target-nums[i];

            if(map.containsKey(complement)){
                return new int[]{i,map.get(complement)};
            }
            map.put(nums[i],i);
        }
        return new int[2];
    }
}
