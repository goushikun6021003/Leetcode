package 动态规划;

public class N70 {
    /**int[] memo;
    public int find(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        if(memo[n]==-1){
            memo[n]=find(n-1)+find(n-2);
        }
        return memo[n];

    }
    public int climbStairs(int n) {
        memo = new int[n+1];
        for(int i=0; i<memo.length;i++){
            memo[i]=-1;
        }
        return find(n);
    }**/
    public int climbStairs(int n) {
        int[] memo = new int[n + 1];
        memo[0]=1;
        memo[1]=1;
        for (int i = 2; i < memo.length; i++) {
            memo[i] = memo[i-1]+memo[i-2];
        }
        return memo[n];
    }
}
