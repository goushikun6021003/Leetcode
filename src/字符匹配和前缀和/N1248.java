package 字符匹配和前缀和;
import java.util.*;
public class N1248 {
    /** public int numberOfSubarrays(int[] nums, int k) {
     if(nums.length==0){
     return 0;
     }
     HashMap<Integer,Integer> map = new HashMap<>();
     map.put(0,1);
     int sum=0;
     int res=0;
     for(int i=0;i<nums.length;i++){
     // 奇数的个数
     sum+=nums[i]%2;
     if(map.containsKey(sum-k)){
     res+=map.get(sum-k);
     }
     map.put(sum,map.getOrDefault(sum,0)+1);
     }
     return res;
     }**/
    // f2
    public int numberOfSubarrays(int[] nums, int k) {
        if(nums.length==0){
            return 0;
        }
        int[] map = new int[nums.length+1];
        map[0]=1;
        int sum=0;
        int res=0;
        for(int i=0;i<nums.length;i++){
            // 奇数的个数
            sum+=nums[i]%2;
            if(sum-k>=0){
                res+=map[sum-k];
            }
            map[sum]++;
        }
        return res;
    }
}
