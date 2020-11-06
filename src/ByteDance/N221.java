package ByteDance;

public class N221 {
    public int maximalSquare(char[][] matrix) {
        int m = matrix.length;
        if(m==0){
            return 0;
        }
        int n=matrix[0].length;
        int[][] res = new int[m][n];
        int max=0;
        for(int i=0;i<n;i++){
            res[0][i]=matrix[0][i]-48;
            max=Math.max(max,res[0][i]);
        }
        for(int i=0;i<m;i++){
            res[i][0]=matrix[i][0]-48;
            max=Math.max(max,res[i][0]);
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                int left=res[i][j-1];
                int top=res[i-1][j];
                int lt=res[i-1][j-1];
                if(matrix[i][j]=='0'){
                    res[i][j]=0;
                }else{
                    if(left!=0 && top!=0 && lt!=0){
                        res[i][j]=Math.min(lt,Math.min(left,top))+1;
                    }else{
                        res[i][j]=1;
                    }
                    max=Math.max(max,res[i][j]);
                }

            }
        }
        return max*max;
    }
}
