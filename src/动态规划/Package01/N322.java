package 动态规划.Package01;

import java.util.Arrays;

public class N322 {
    // 完全背包，不需要初始化，逆序改正序
    public int coinChange(int[] coins, int amount) {
        int memo[]=new int[amount+1];
        Arrays.fill(memo,Integer.MAX_VALUE);

        memo[0]=0;
        for(int i=0;i<coins.length;i++){
            for(int j=coins[i];j<=amount;j++){
                if(memo[j-coins[i]]!=Integer.MAX_VALUE){ // java最大值+1会变成负数，涉及到补码。所以加这个限制条件
                    memo[j]=Math.min(memo[j], memo[j-coins[i]]+1);
                }
            }
        }
        if(memo[amount]==Integer.MAX_VALUE){
            return -1;
        }
        return memo[amount];
    }
}
