package 动态规划;

public class N309 {
    public int maxProfit(int[] prices) {
        if(prices.length<=1){
            return 0;
        }
       int s0; // s0为 rest后的rest，或者sell后的rest
       int s1; // s1为 rest后buy，或者buy后的rest
       int s2; // s2为 buy后的sell

        s0=0;
        s1=-prices[0];
        s2=0;
        for(int i=1;i<prices.length;i++){
            int p0=s0;
            int p1=s1;
            int p2=s2;
            s0=Math.max(p0,p2);
            s1=Math.max(p1,p0-prices[i]);
            s2=p1+prices[i];
        }
        return Math.max(s0,s2);
    }
}
