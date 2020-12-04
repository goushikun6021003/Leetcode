package 数组相关.快慢指针移除元素;

// 移除所有重复元素
public class RemoveEx {
    public int removeDuplicates(int[] nums) {

        if(nums.length==0) return 0;
        int slow=0;
        boolean flag=false;
        for(int fast=1;fast<nums.length;fast++){
            if(nums[fast]==nums[fast-1]){
                flag=true;
            }else{
                if(flag==true){
                    nums[slow]=nums[fast];
                    flag=false;
                }else{
                    slow++;
                    nums[slow]=nums[fast];

                }
            }
        }
        if(flag==true){
            return slow;
        }
        return slow+1;
    }
}
