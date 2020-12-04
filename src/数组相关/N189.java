package 数组相关;

public class N189 {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        if(length<=1||k==0){
            return;
        }
        k=k%length;
        if(k==0){
            return;
        }
        reverse(nums,0,length-1);
        reverse(nums,0,k-1);
        reverse(nums, k,length-1);
    }
    public void reverse(int[] nums,int start,int end){
        if(nums.length==0){
            return;
        }
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
    public void swap(int[] nums,int a,int b ){
        int temp = nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }


}
