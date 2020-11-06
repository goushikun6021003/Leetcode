package 递归回溯法.Combination_Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N40 {

    private void find(int[] nums, int target, int index, ArrayList<Integer> list, List<List<Integer>> result){
        //将sum求和转化为 target-nums[index]，所以最后为0时结束
        if(target==0){
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i = index; i<nums.length; i++){
            if(nums[i]>target){
                break;
            }
            if(i>index && nums[i]==nums[i-1]){
                continue;
            }
            list.add(nums[i]);
            find(nums,target-nums[i],i+1,list,result);// 转化sum的思想！！！
            list.remove(list.size()-1);

        }
        return;
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        Arrays.sort(candidates);// 有重复元素以及求和考虑先排序！！！
        find(candidates,target,0,list,result);
        return result;
    }

}
