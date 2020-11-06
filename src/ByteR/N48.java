package ByteR;

public class N48 {
    public void rotate(int[][] matrix) {
        int m=matrix.length;
        if(m==0){
            return;
        }
        int n=matrix[0].length;
        int temp=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n-i;j++){
                temp=matrix[m-1-j][n-1-i];
                matrix[m-1-j][n-1-i]=matrix[i][j];
                matrix[i][j]=temp;
            }
        }
        for(int j=0;j<n;j++){
            for(int i=0;i<m/2;i++){
                temp=matrix[m-i-1][j];
                matrix[m-i-1][j]=matrix[i][j];
                matrix[i][j]=temp;
            }
        }
    }
}
