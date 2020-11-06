package 数组相关.滑动窗口;

class N209 {

    public int minSubArrayLen(int s, int[] nums) {
        int l=0,r=-1;
        int sum=0;
        int res=nums.length+1;
        while(l<nums.length){
            if(sum<s && r+1<nums.length){
                sum = sum + nums[++r];
            }else{
                sum -=nums[l++];
            }
            if(sum>=s){
                res = Math.min(res,r-l+1);
            }
        }
        if(res==nums.length+1){
            return 0;
        }
        return res;
    }
}
