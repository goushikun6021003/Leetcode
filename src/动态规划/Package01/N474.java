package 动态规划.Package01;

public class N474 {
    private int[] cal(String s){
        int m=0;
        int n=0;
        int res[]=new int[2];

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                m++;
            }else{
                n++;
            }
        }
        res[0]=m;
        res[1]=n;
        return res;
    }
    public int findMaxForm(String[] strs, int m, int n) {
        int memo[][]=new int[m+1][n+1];
        int nums[][]=new int[strs.length][2];
        for(int i=0;i<strs.length;i++){
            nums[i]=cal(strs[i]);
        }
        for(int i=0;i<nums.length;i++){
            for(int j=m;j>=nums[i][0];j--){
                for(int k=n;k>=nums[i][1];k--){
                    memo[j][k]=Math.max(memo[j][k],memo[j-nums[i][0]][k-nums[i][1]]+1);

                }
            }
        }
        return memo[m][n];
    }

}
