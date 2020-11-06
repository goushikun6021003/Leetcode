package 数组相关;

public class N283 {
    public void moveZeroes(int[] nums) {
        int i=0;
        int temp = 0;
        for (int m = 0; m < nums.length; m++){
            if(nums[m]!=0){

                temp = nums[i];
                nums[i]=nums[m];
                nums[m]=temp;
                i++;

            }

        }
    }
}
