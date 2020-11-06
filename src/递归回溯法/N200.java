package 递归回溯法;

public class N200 {
    boolean[][] visited;
    int m,n;
    int res=0;
    int[] xMove=new int[]{-1,0,1,0};
    int[] yMove=new int[]{0,1,0,-1};
    private void find(char[][] grid, int x, int y){
        for(int i=0; i<4;i++){
            int newX= x+xMove[i];
            int newY = y+ yMove[i];
            if(Area(newX,newY)&& !visited[newX][newY] && grid[newX][newY]=='1'){
                visited[newX][newY]=true;
                find(grid,newX,newY);
            }
        }
        return;
    }
    private boolean Area(int x,int y){
        return (x>=0 && y>=0 && x<m && y<n);
    }
    public int numIslands(char[][] grid) {
        m = grid.length;
        if(m==0){
            return 0;
        }
        n= grid[0].length;
        visited = new boolean[m][n];

        for(int i=0; i < m; i++){
            for(int j=0; j < n; j++){
                if(grid[i][j]=='1'&& !visited[i][j]){
                    res++;
                    visited[i][j]=true;
                    find(grid,i,j);
                }
            }
        }
        return res;
    }
}
