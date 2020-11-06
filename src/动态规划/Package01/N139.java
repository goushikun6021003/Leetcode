package 动态规划.Package01;

import java.util.List;

public class N139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        // 状态为memo[0,j)为真且s.subString(j,i)也包含在wordDict中
        boolean[] memo = new boolean[s.length()+1];
        memo[0]=true;
        for(int i=1;i<=s.length();i++){
            for(int j=i-1;j>=0;j--){
                String check = s.substring(j,i);
                if(memo[j]&&wordDict.contains(check)){
                    memo[i]=true;
                }
            }
        }

        return memo[s.length()];
    }
}
