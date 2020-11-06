package ByteDance;

public class N48 {
    public void rotate(int[][] matrix) {
        int length = matrix.length;
        for(int i=0;i<length;i++){
            for(int j=0;j<length-i;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[length-j-1][length-i-1];
                matrix[length-j-1][length-i-1]=temp;
            }
        }
        for(int i=0;i<length;i++){
            for(int j=0;j<length/2;j++){
                int temp = matrix[j][i];
                matrix[j][i]=matrix[length-j-1][i];
                matrix[length-j-1][i]=temp;
            }
        }
    }
}
