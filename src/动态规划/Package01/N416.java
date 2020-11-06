package 动态规划.Package01;

public class N416 {
    //01背包
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum%2!=0){
            return false;
        }
        int c=sum/2;
        boolean[] memo=new boolean[c+1];
        memo[0]=true;
        for(int i=0;i<nums.length;i++){
            for(int j=c;j>=nums[i];j--){
                memo[j]=(memo[j]||memo[j-nums[i]]);
            }
        }
        return memo[c];
    }
}
