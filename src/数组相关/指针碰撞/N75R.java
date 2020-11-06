package 数组相关.指针碰撞;

public class N75R {
    public void sortColors(int[] nums) {
        int zero=-1;
        int one;
        int two=nums.length;
        for(int i =0; i<two;){// 判断0-two 不是 0-nums.length
            if(nums[i]==1){
                i++;
            }
            if(nums[i]==0){

                nums[i]=nums[++zero];
                nums[zero]=0;
                i++;
            }
            if(nums[i]==2){

                nums[i]=nums[--two];
                nums[two]=2;
            }
        }
    }
}
