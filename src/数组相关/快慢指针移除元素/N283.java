package 数组相关.快慢指针移除元素;

public class N283 {
    public void moveZeroes(int[] nums) {
        int slow=0;
        int temp;
        for(int fast=0;fast<nums.length;fast++){
            if(nums[fast]!=0){
                temp=nums[fast];
                nums[fast]=nums[slow];
                nums[slow]=temp;
                slow++;
            }
        }
    }
}
