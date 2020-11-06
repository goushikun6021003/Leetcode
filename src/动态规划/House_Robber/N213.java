package 动态规划.House_Robber;

public class N213 {
    int memo[];// [0,n-1]
    int memo1[];// 代表[1,n-1]
    int memo2[];// 代表[0,n-2]
    // 变为环形为 状态方程为F(n)=max(f(0,n-1),f(1,n))
    public int rob(int[] nums) {

        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return Math.max(nums[0],nums[1]);
        }

        memo = new int[nums.length];
        memo1= new int[nums.length];
        memo2= new int[nums.length];

        // 计算[1,n-1]的最大利益
        memo1[1]=nums[1];
        memo1[2]=Math.max(nums[1],nums[2]);
        for(int i=3;i<nums.length;i++){

            memo1[i]=Math.max(memo1[i-1],memo1[i-2]+nums[i]);
        }

        //计算[0,n-2]的最大利益
        memo2[0]=nums[0];
        memo2[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length-1;i++){
            memo2[i]=Math.max(memo2[i-1],memo2[i-2]+nums[i]);
        }
        // 最后为memo1和memo2的最大值
        memo[0]=nums[0];
        memo[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++){

            memo[i]=Math.max(memo1[i],memo2[i-1]);
        }

        return memo[nums.length-1];
    }
}
