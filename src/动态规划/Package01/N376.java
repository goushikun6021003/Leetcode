package 动态规划.Package01;

import java.util.Arrays;

public class N376 {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length<2){
            return nums.length;
        }
        int[] p = new int[nums.length];
        int[] q= new int[nums.length];
        Arrays.fill(p,1);
        Arrays.fill(q,1);
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                p[i]=q[i-1]+1;
                q[i]=q[i-1];
            }else if(nums[i]<nums[i-1]){
                q[i]=p[i-1]+1;
                p[i]=p[i-1];
            }else{
                p[i]=p[i-1];
                q[i]=q[i-1];
            }
        }
        return Math.max(p[nums.length-1],q[nums.length-1]);
    }
}
