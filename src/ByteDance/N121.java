package ByteDance;

public class N121 {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int max=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }else{
                if(max<prices[i]-min){
                    max=prices[i]-min;
                }
            }
        }
        return max;
    }
}
