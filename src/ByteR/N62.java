package ByteR;

public class N62 {
    public int uniquePaths(int m, int n) {
        int[][] memo = new int[m][n];
        for(int i=1;i<m;i++){
            memo[i][0]=memo[i-1][0];
        }
        for(int i=1;i<n;i++){
            memo[0][i]=memo[0][i-1];
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                memo[i][j]=memo[i-1][j]+memo[i][j-1];
            }
        }
        return memo[m-1][n-1];
    }
}
