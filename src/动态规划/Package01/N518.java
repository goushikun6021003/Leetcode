package 动态规划.Package01;

public class N518 {
    // 注意和377区别
    public int change(int amount, int[] coins) {
        int memo[]=new int[amount+1];

       /** for(int j=1;j<=target;j++){
            memo[0]=1;
            for(int i=0;i<nums.length;i++){
                if(j>=nums[i]){
                    memo[j]+=memo[j-nums[i]];
                }
            }
        }
        **/
        memo[0]=1;
        for(int i=0;i<coins.length;i++){
            for(int j=coins[i];j<=amount;j++){
                memo[j]+=memo[j-coins[i]];

            }
        }

        return memo[amount];
    }

}
