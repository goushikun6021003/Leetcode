package 数组相关.滑动窗口;

public class N80 {
    public int removeDuplicates(int[] nums) {
        if(nums.length<3){
            return nums.length;
        }
        int i=1;
        int c=1;
        for(int j=1;j<nums.length;j++){
            if(c<=2&&nums[j]==nums[j-1]){
               c++;
               if(c<=2){
                   nums[i]=nums[j];
                   i++;
               }
            }else if(nums[j]!=nums[j-1]){
                c=1;
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }
}
