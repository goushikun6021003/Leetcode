package 字符匹配和前缀和;
import java.util.*;
public class N724_930 {
    public int subarraySum(int[] nums, int k) {
        /**  int sum=0;
         int res=0;
         for(int i=0;i<nums.length;i++){

         for(int j=i;j<nums.length;j++){

         sum+=nums[j];
         if(k==sum){
         res++;

         }
         }

         sum=0;

         }

         return res;**/
        if(nums.length==0){
            return 0;
        }
        int res=0;
        int sum=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int num:nums){
            sum+=num;
            if(map.containsKey(sum-k)){
                res+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return res;
    }
}
