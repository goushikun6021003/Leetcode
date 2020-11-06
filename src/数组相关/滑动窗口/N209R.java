package 数组相关.滑动窗口;

public class N209R {
    public int minSubArrayLen(int s, int[] nums) {
        int l=0;
        int r=-1;
        int sum=0;
        int res=nums.length+1;
        while(l<nums.length){
            if(sum<s&&r+1<nums.length){
                sum+=nums[++r];
            }else{
                sum-=nums[l++];
            }
            if(sum>=s){
                res=Math.min(res,r-l+1);
            }
        }
        return res;
    }
}
