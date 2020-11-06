package 动态规划.Package01;

import java.util.Arrays;

public class N300 {
    public int lengthOfLIS(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int[] memo = new int[nums.length];
        Arrays.fill(memo,1);
        for(int i=1;i<nums.length;i++){
            for(int j=0; j<i;j++){
                if(nums[i]>nums[j]){
                    memo[i]=Math.max(memo[i],memo[j]+1);
                }
            }
        }
        int res=1;
        for(int i=0;i<memo.length;i++){
            res=Math.max(res,memo[i]);
        }
        return res;
    }
}
