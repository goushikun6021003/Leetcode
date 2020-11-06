package 递归回溯法;

import java.util.ArrayList;
import java.util.List;

public class N46 {
   boolean[] used;
    public void find(int[] nums, int index, ArrayList<Integer> list, List<List<Integer>> storeList){
        //触发结束条件
        if(index==nums.length){
            storeList.add(new ArrayList<>(list));// 特别注意list覆盖问题，因为list里存的是object的引用，所以添加新的时会覆盖旧的
                                                  //解决方法为每次 new 新的 list
            return;
        }
        for(int i=0; i<nums.length; i++){
           if(!used[i]){
               list.add(nums[i]);
               used[i]=true;
               find(nums,index+1,list,storeList);
               used[i]=false;
              // list.remove(list.size()-1);
               list.remove(Integer.valueOf(nums[i]));// remove 识别整数时，index or object混淆
           }
        }
        return;
    }
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> storeList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<Integer>();

        if(nums.length==0){
            return storeList;
        }
        used = new boolean[nums.length];
        find(nums,0,list,storeList);
        return storeList;
    }
}
