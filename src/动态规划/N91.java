package 动态规划;

public class N91 {
    public int numDecodings(String s) {
       if(s.length()==0 || s.equals("0")){
           return 0;
       }
       int memo[] = new int[s.length()];

       memo[0]=s.charAt(0)!='0'? 1:0;
       if(s.length()==1){
           return memo[0];
       }
        int k = s.charAt(0) > '0' && s.charAt(1) > '0'? 1:0;
        memo[1] = k + (s.charAt(0) == '1' || s.charAt(0) == '2' && s.charAt(1) <= '6' ? 1:0);
        for(int i=2; i<s.length();i++){
            if(s.charAt(i)>'0')
                memo[i]= memo[i-1];
            if(s.charAt(i-1) == '1' || s.charAt(i-1) == '2' && s.charAt(i) <= '6'){
                memo[i]=memo[i]+memo[i-2];
            }
        }
        return memo[s.length()-1];















    }

}
