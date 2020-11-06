package 动态规划;

public class N62 {
    public int uniquePaths(int m, int n) {

        int memo[][] = new int[m][n];
        memo[0][0]=1;
        for(int j=1;j<n;j++){
            memo[0][j]=1;
        }
        for(int i=1;i<m;i++){
            memo[i][0]=1;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                memo[i][j]=memo[i-1][j]+memo[i][j-1];
            }

        }
        return memo[m-1][n-1];
    }
}
