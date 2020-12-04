package 数组相关.快慢指针移除元素;

public class N27 {
    public int removeElement(int[] nums, int val) {
        if(nums.length==0){
            return 0;
        }
        int slow=0;
        for(int fast=0;fast<nums.length;fast++){
            if(nums[fast]!=val){
                nums[slow]=nums[fast];
                slow++;
            }
        }
        return slow;
    }
}
