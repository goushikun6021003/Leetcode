package 动态规划;

public class N63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if(obstacleGrid[m-1][n-1]==1||obstacleGrid[0][0]==1){
            return 0;
        }
        int memo[][] = new int[m][n];
        memo[0][0]=1;
        for(int j=1;j<n;j++){
            if(obstacleGrid[0][j]==1){
                memo[0][j]=0;
                continue;
            }
            memo[0][j]=memo[0][j-1];
        }
        for(int i=1;i<m;i++){
            if(obstacleGrid[i][0]==1){
                memo[i][0]=0;
                continue;
            }
            memo[i][0]=memo[i-1][0];

        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(obstacleGrid[i][j]==1){
                    memo[i][j]=0;
                    continue;
                }
                memo[i][j]=memo[i-1][j]+memo[i][j-1];
            }

        }
        return memo[m-1][n-1];
    }
}
