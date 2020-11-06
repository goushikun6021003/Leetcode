package ByteDance;

public class N162 {
    public int findPeakElement(int[] nums) {
        int l=0;
        int r=nums.length-1;
        while(l<r){
            int mid=(l+r)/2;
            if((mid==0||nums[mid]>nums[mid-1])&&(mid==nums.length-1||nums[mid]>nums[mid+1])){
                return mid;
            }else if(nums[mid+1]>nums[mid]){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return l;
    }

}
