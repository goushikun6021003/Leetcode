package 动态规划;

public class N5 {
    public String longestPalindrome(String s) {
        if(s.equals("")){
            return s;
        }
        int maxlen=1;
        int start=0;
        boolean memo[][]=new boolean[s.length()][s.length()];
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                memo[i][i+1]=true;
                maxlen=2;
                start=i;
            }
            memo[i][i]=true;
        }
        memo[s.length()-1][s.length()-1]=true;

        for(int i=3;i<=s.length();i++){
            for(int j=0;j+i-1<s.length();j++){
                int k=j+i-1;
                memo[j][k]=memo[j+1][k-1]&&(s.charAt(j)==s.charAt(k));
                if(memo[j][k]&&i>maxlen){
                    maxlen=i;
                    start=j;
                }
            }
        }
        return s.substring(start,start+maxlen-1);
    }

}
