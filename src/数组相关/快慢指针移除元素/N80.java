package 数组相关.快慢指针移除元素;

public class N80 {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        int slow=0;
        int count=1;
        for(int fast=1;fast<nums.length;fast++){
            if(nums[fast]==nums[fast-1]&&count<=2){ // 更改count小于几则最多出现几次
                count++;
                if(count<=2&&fast<nums.length){
                    slow++;
                    nums[slow]=nums[fast];
                }
            }else if(nums[fast]!=nums[fast-1]){
                slow++;
                nums[slow]=nums[fast];
                count=1;

            }

        }
        return slow+1;
    }
}
