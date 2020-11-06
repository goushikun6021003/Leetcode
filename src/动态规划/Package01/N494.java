package 动态规划.Package01;

public class N494 {
    // 亮点，将加 正负号 问题 转化为全部加 正号 的问题，也就是熟悉的背包问题
    // 正子集 - 负子集 = target
    // 正子集 + 负子集 = sum
    // 所以 正子集 = (target+sum)/2
    public int findTargetSumWays(int[] nums, int S) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum<S||(sum+S)%2!=0){
            return 0;
        }
        int target=(sum+S)/2;

        int memo[]=new int[target+1];
        memo[0]=1;

        for(int i=0;i<nums.length;i++){
            for(int j=target;j>=nums[i];j--){
                memo[j]+=memo[j-nums[i]];
            }
        }
        return memo[target];
    }
}
