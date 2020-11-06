package 数组相关.指针碰撞;

public class N75T {
    public void sortColors(int[] nums) {
        int zero=-1; // [0,zero] 0
        int two = nums.length; //[two,nums.length-1] 2, [zero+1, two-1] 1
        int temp;
        for(int i=0;i<nums.length;){
            if(nums[i]==1){
                i++;
            }else if(nums[i]==2){
                two--;
                temp=nums[two];
                nums[two]=nums[i];
                nums[i]=temp;

            }else{
                zero++;
                temp=nums[zero];
                nums[zero]=nums[i];
                nums[i]=temp;
                i++;
            }
        }
    }
}
