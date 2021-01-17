package 数组相关.指针碰撞;

public class N75 {
    //F1:三路快排
    public void sortColors(int[] nums) {
        int zero = -1; // [0,zero]为0区间
        int temp;           // [zero+1,two-1]为1区间
        int two = nums.length;// [two,n-1]为2区间
        for(int i = 0; i < two;){
            if(nums[i]==1){
                i++;
            }else if (nums[i]==2){
                two--;
                temp=nums[i];
                nums[i]=nums[two];
                nums[two]=temp;
            }else{
                assert (nums[i]==0);
                // 用temp中间值交换，不要直接改0和1！
                zero++;
                temp=nums[i];
                nums[i]=nums[zero];
                nums[zero]=temp;
                i++;
            }
        }
    }
    //F2:
    public void sortColors2(int[] nums) {
        int[] count = new int[3];
        int index=0;
        for(int i = 0; i < nums.length; i++){
            count[nums[i]]++;
        }
        for(int m =0; m<3;m++){
            for(int i=0; i < count[m]; i++ ){
                nums[index++]=m;
            }
        }
    }
}
