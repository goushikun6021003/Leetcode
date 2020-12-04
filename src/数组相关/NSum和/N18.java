package 数组相关.NSum和;

import java.util.*;

public class N18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if(nums.length<4) return new ArrayList<>();
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();

        for(int i=0; i<nums.length-3;i++){
            for(int j=i+1; j<nums.length-2;j++){
                int k=j+1;
                int l=nums.length-1;
                while(k<l){
                    int sum=nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum==target){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k++]);
                        temp.add(nums[l--]);
                        res.add(temp);
                    }else if(sum<target){
                        k++;
                    }else{
                        l--;
                    }
                }
            }
        }
        return new ArrayList<>(res);
    }
}
