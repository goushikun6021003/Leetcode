package 动态规划;

public class N343 {
    int[] memo;
    private int max3(int a, int b, int c){
        return Math.max(a,Math.max(b,c));
    }
// F1：自顶向下记忆化搜索
 /**   public int integerBreak(int n) {
        memo = new int[n+1];
        return find(n);
    }
    // 至少分割为两个值的和
    public int find(int n){
        int res=-1;
        if(n==1){
            return 1;
        }
        if(memo[n]!=0){
            return memo[n];
        }
        for(int i=1;i<n;i++){
            res=max3(res,i*find(n-i),i*(n-i));
        }
        memo[n]=res;
        return res;
    }
  **/
    // F2: 自底向上动态规划
    public int integerBreak(int n) {
        memo = new int[n+1];
        memo[1]=1;
        for(int i=2;i<=n;i++){
            // 求解memo[i]
            for(int j=1;j<i;j++){
                //将 i 分解为 j+(i-j),分别求乘积，得到最大值
                memo[i]=max3(memo[i],j*(i-j),j*memo[i-j]);
            }

        }
        return memo[n];
    }
}
