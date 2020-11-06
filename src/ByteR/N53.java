package ByteR;

public class N53 {
    public int maxSubArray(int[] nums) {
        int n = nums.length;

        int sum=0;
        int res=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(sum<=0){
                sum=nums[i];
            }else{
                sum+=nums[i];
            }
            res=Math.max(res,sum);
        }
        return res;
    }
}
