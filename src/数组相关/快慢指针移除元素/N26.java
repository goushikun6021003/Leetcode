package 数组相关.快慢指针移除元素;

public class N26 {
    public int removeDuplicates(int[] nums) {
        /**if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;**/
        if(nums.length==0) return 0;
        int slow=0;
        for(int fast=1;fast<nums.length;fast++){
            if(nums[fast]!=nums[fast-1]){
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow+1;
    }
}
