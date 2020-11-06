package 递归回溯法;

import java.util.ArrayList;
import java.util.List;

public class N77R {
    public void find(int n, int k, int index, ArrayList<Integer> list, List<List<Integer>> result){
        if(k==list.size()){
            result.add(new ArrayList<>(list));
            return;// 停止回溯 很重要！！！
        }
        for(int i = index;i<=n-(k-list.size())+1;i++){//这里是 <= 切记

            list.add(i);
            find(n,k,i+1,list,result);
            list.remove(list.size()-1);
        }
        return;
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<Integer>();

        if(n<=0||k<=0||k>n){
            return result;
        }
        find(n,k,1,list,result);
        return result;
    }
}
