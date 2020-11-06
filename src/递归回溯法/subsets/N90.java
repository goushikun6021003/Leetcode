package 递归回溯法.subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N90 {
    private void find(int[] nums, int index, ArrayList<Integer> list, List<List<Integer>> result){


        result.add(new ArrayList<>(list));


        for(int i=index; i<nums.length;i++){
            if(i>index&&nums[i]==nums[i-1]){
                continue;
            }
            list.add(nums[i]);
            find(nums,i+1,list,result);
            list.remove(list.size()-1);
        }
        return;
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(nums.length==0){
            return result;
        }
        Arrays.sort(nums);// 有重复元素以及求和考虑先排序！！！
        find(nums,0,list,result);
        return result;
    }
}
