package 递归回溯法.Combination_Sum;

import java.util.ArrayList;
import java.util.List;

public class N216R {
    public void find(int k, int n, int index, ArrayList<Integer> list, List<List<Integer>> result){
        if(n==0 && 0==k){
            result.add(new ArrayList<>(list));
        }
        for(int i = index;i<10;i++){
            if(i>n){
                break;
            }
            list.add(i);
            find(k-1,n-i,i+1,list,result);
            list.remove(list.size()-1);
        }
        return;
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<Integer>();

        if(n<=0||k<=0||k>9){
            return result;
        }
        find(k,n,1,list,result);
        return result;
    }
}
