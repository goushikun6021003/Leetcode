package 递归回溯法;

public class N130R {
    boolean visited[][];
    int m,n;
    int[] xMove = {-1,0,1,0};
    int[] yMove = {0,1,0,-1};
    public void find(char[][] board, int x, int y){
        for(int i =0; i<4 ; i++){
            int newX = x + xMove[i];
            int newY = y + yMove[i];
            if(Area(newX,newY) &&!visited[newX][newY] &&  board[newX][newY]=='O'){
                visited[newX][newY]= true;
                find(board,newX,newY);
            }
        }
        return;
    }
    public boolean Area(int x,int y){
        return (x>0 && y>0 && x < m && y<n);
    }
    public void solve(char[][] board) {
        m = board.length;
        if( m == 0 ){
            return;
        }
        n = board[0].length;
        if( n == 0){
            return;
        }
        visited = new boolean[m][n];
        for( int i=0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(board[i][j]=='O' && !visited[i][j] && (i==0 || i == m-1 || j==0 || j == n-1)){
                   visited[i][j]=true;
                   find(board,i,j);
                }
            }
        }
        for( int i=0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(board[i][j]=='O' && visited[i][j]==false){
                    board[i][j]='X';
                }
            }
        }
    }
}
