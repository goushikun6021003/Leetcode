package ByteR;

public class N189 {
    public void rotate(int[] nums, int k) {
        if(nums.length==0||k==0){
            return;
        }
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);

    }
    private void reverse(int[] nums, int start,int end){
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
    private void swap(int[] nums,int l,int r){
        int temp=nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
    }
}
