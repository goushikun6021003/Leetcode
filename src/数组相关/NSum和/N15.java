package 数组相关.NSum和;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class N15 {
    /**public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length<3){
            return new ArrayList<>();
        }
        Set<List<Integer>> set = new HashSet();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    set.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                }else if(sum>0){
                    k--;
                }else if(sum<0){
                    j++;
                }
            }
        }
        return new ArrayList<>(set);
    }**/
    public List<List<Integer>> threeSum(int[] nums){
        if(nums.length<3){
            return new ArrayList<>();
        }
        //HashSet<List<Integer>> result = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int l=i+1;
            int r=nums.length-1;
            while(l<r){
                int sum=nums[i]+nums[l]+nums[r];
                if(sum==0){
                    result.add(Arrays.asList(nums[i],nums[l++],nums[r--]));
                    // 要不添加时去重，要不用Hashset去重
                    while(l<r&&nums[l]==nums[l-1]){
                        l++;
                    }
                    while(l<r&&nums[r]==nums[r+1]){
                        r--;
                    }
                }else if(sum<0){
                    l++;
                }else if(sum>0){
                    r--;
                }
            }
        }
        //return new ArrayList<>(result);
        return result;
    }
}
