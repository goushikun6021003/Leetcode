package 动态规划;

import java.util.Arrays;

public class N279 {
    public int numSquares(int n) {
        int memo[] = new int[n+1];
        Arrays.fill(memo, Integer.MAX_VALUE);
        for(int i=1;i*i<=n;i++){
            memo[i*i]=1;
        }
        for(int i=1;i<=n;i++){
            for(int j=1; j*j<i;j++){
                if(memo[i-j*j]!=Integer.MAX_VALUE){
                    memo[i]=Math.min(memo[i],memo[i-j*j]+1);
                }

            }
        }

        return memo[n];
    }
}
