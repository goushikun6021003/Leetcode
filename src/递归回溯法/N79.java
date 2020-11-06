package 递归回溯法;

public class N79 {
    private boolean[][] used;
    int m;
    int n;
    int[] xMove=new int[]{-1,0,1,0};
    int[] yMove=new int[]{0,1,0,-1};
    private boolean find(char[][] board,String word,int index,int x,int y){
        if(index == word.length()-1){
            return (word.charAt(index)==board[x][y]);
        }
        if(board[x][y]==word.charAt(index)){
            used[x][y]=true;
            for(int i = 0; i < 4;i++){

                int newX= x+xMove[i];
                int newY = y+ yMove[i];
                if(Area(newX,newY) && !used[newX][newY]&& find(board,word,index+1,newX,newY))
                    return true;

            }
            used[x][y]=false;
        }
        return false;
    }
    private boolean Area(int x,int y){
        return (x>=0 && y>=0 && x<m && y<n);
    }
    public boolean exist(char[][] board, String word) {
        boolean res = false;
        m= board.length;
        n=board[0].length;
        used = new boolean[m][n];
        for(int i = 0; i<m; i++){
            for(int j=0; j<n; j++){
                if(board[i][j]==word.charAt(0)){
                    used[i][j]=true;
                    res = find(board,word,0,i,j);
                    used[i][j]=false;
                    if( res == true){
                        return res;
                    }

                }


            }
        }
        return res;
    }
}
