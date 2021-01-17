package 字符匹配和前缀和;
import java.util.*;
public class N523 {
    public boolean checkSubarraySum(int[] nums, int k) {
        if(nums.length==0){
            return false;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum=0;

        for(int i=0;i<nums.length;i++){

            sum+=nums[i];
            // 防止除数为0
            int key = k==0?sum:sum%k;
            if(map.containsKey(key)){
                if(i-map.get(key)>=2){
                    return true;
                }
                // 只存最小下标
                continue;

            }
            map.put(key,i);
        }
        return false;
    }
}
