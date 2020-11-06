package ByteDance;

public class N33 {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int l=0;
        int r=n-1;
        while(l<r){
            int mid = (l+r)/2;
            if(nums[l]==target) return l;
            if(nums[r]==target) return r;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>nums[l]){
                if(nums[mid]>target){
                   if(target>nums[l]){
                       r=mid-1;
                   }else{
                       l=mid+1;
                   }
                }else{
                    l=mid+1;
                }
            }else{
                if(nums[mid]>target){
                    r=mid-1;
                }else{
                    if(target>nums[r]){
                        r=mid-1;
                    }else{
                        l=mid+1;
                    }
                }
            }
        }
        return -1;
    }

}
