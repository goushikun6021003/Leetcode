package 动态规划;

public class N64 {
    public int minPathSum(int[][] grid) {

        int m = grid.length;
        int n =grid[0].length;
        int[][] nums= new int[m][n];
        nums[0][0]=grid[0][0];
        for(int j=1;j<n;j++){
            nums[0][j]=grid[0][j]+nums[0][j-1];
        }
        for(int i=1;i<m;i++){
            nums[i][0]=grid[i][0]+nums[i-1][0];
        }
        for(int i = 1; i<m; i++){
            for(int j=1; j<n; j++){
                nums[i][j]=grid[i][j]+Math.min(nums[i][j-1],nums[i-1][j]);
            }
        }
        return nums[m-1][n-1];
    }
}
