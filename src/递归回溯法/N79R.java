package 递归回溯法;

public class N79R {
    int m,n;
    boolean[][] visited;

    int[] xMove=new int[]{-1,0,1,0};
    int[] yMove=new int[]{0,1,0,-1};
    public boolean find(char[][] board, String word, int index, int x, int y){
        if(index==word.length()-1){
            return (board[x][y]==word.charAt(index));
        }
        if(board[x][y]==word.charAt(index)){
            visited[x][y]=true;
            for(int i=0;i<4;i++){
                int newX = x + xMove[i];
                int newY = y + yMove[i];
                if(Area(newX,newY)&&!visited[newX][newY]&&find(board,word,index+1,newX,newY) ){
                    return true;
                }
            }
            visited[x][y]=false;
            return false;
        }
        return false;
    }
    public boolean Area(int x,int y){
        return (x>=0 && y>=0 && x < m && y<n);//大于等于 切记！！！
    }
    public boolean exist(char[][] board, String word) {
        boolean res=false;
        m = board.length;
        n = board[0].length;
        visited = new boolean[m][n];
        for(int i=0; i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]== word.charAt(0)){
                    visited[i][j]=true;
                    res=find(board,word,0,i,j);
                    visited[i][j]=false;
                    if(res==true){
                        return res;
                    }
                }
            }
        }
        return res;
    }
}
