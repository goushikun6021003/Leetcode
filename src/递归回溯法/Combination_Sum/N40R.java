package 递归回溯法.Combination_Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N40R {
    public void find(int[] candidates, int target, int index, ArrayList<Integer> list, List<List<Integer>> result){
        if(target==0){
            result.add(new ArrayList<>(list));
        }
        for(int i = index; i<candidates.length;i++){
            if(candidates[i]>target){
                break;
            }
            if(i>index&&candidates[i]==candidates[i-1]){
                continue;
            }
            list.add(candidates[i]);
            find(candidates,target-candidates[i],i+1,list,result);
            list.remove(list.size()-1);
        }
        return;
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        if(candidates.length==0){
            return result;
        }
        Arrays.sort(candidates);
        find(candidates,target,0,list,result);
        return result;
    }
}
