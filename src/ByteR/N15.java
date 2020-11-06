package ByteR;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N15 {
    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> res=new ArrayList<>();
        if(nums.length<3){
            return res;
        }
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length-2;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int k=nums.length-1;
            int j=i+1;
            while(j<k){
                sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    res.add(Arrays.asList(i,j,k));
                    j++;
                    k--;
                    while(nums[j]==nums[j-1]){
                        j++;
                    }
                    while(nums[k]==nums[k+1]){
                        k--;
                    }
                }else if(sum>0){
                    k--;
                }else{
                    j++;
                }
            }
        }
        return res;
    }
}
