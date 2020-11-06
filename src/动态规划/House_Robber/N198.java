package 动态规划.House_Robber;

import java.util.Arrays;

public class N198 {
    int memo[];
 // F1: 自顶向下的方法，memo[i]表示抢劫[i,n]之间房子所能获得的最大价值
 /**   public int rob(int[] nums) {
        memo = new int[nums.length];
        Arrays.fill(memo,-1);
        return find(nums,0);
    }
    // 考虑抢劫[index,n]之间的房子
    private int find(int[] nums,int index){
        int res=0;
        if(index >= nums.length){
            return 0;
        }
        if(memo[index]!=-1){
            return memo[index];
        }
        for(int i=index; i<nums.length;i++){
            res=Math.max(res,nums[i]+find(nums,i+2));
        }
        memo[index]=res;
        return res;
    }
  **/
  // F1变形：自顶向下，memo[i]表示抢劫[0,i]之间房子所能获得的最大价值
     public int rob(int[] nums) {
        memo = new int[nums.length];
        Arrays.fill(memo,-1);
        return find(nums,nums.length-1);
     }
     // 考虑抢劫[0,index]之间的房子
     private int find(int[] nums,int index){
        if(index<0){
            return 0;
        }
        if(index==0){
            return nums[0];
        }
        if(index==1){
            return Math.max(nums[0],nums[1]);
        }

        if(memo[index]!=-1){
            return memo[index];
        }

        memo[index]=Math.max(find(nums,index-1),nums[index]+find(nums,index-2));
        return memo[index];
     }

    // F2：自底向上的方法
    // memo[n]代表抢劫[0-n]个房子所能获得的最大收益
   /** public int rob(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        memo = new int[nums.length];
        Arrays.fill(memo,-1);
        memo[0]=nums[0];
        memo[1]=Math.max(nums[0],nums[1]);

        for(int i=2;i<nums.length;i++){

            memo[i]=Math.max(memo[i-1],memo[i-2]+nums[i]);
        }
        return memo[nums.length-1];
    }
    **/
}
