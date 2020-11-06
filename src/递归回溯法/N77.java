package 递归回溯法;

import java.util.ArrayList;
import java.util.List;

public class N77 {
    private void find(int n, int k, int index, ArrayList<Integer> list, List<List<Integer>> result){
        if(list.size()==k){
            result.add(new ArrayList<Integer>(list));
            return;
        }
        // 还有K-list.size()个空位，所以[i...n]中至少要有k-list.size()个元素
        // i最大为n-(k-list.size())+1
        //for(int i=index; i<=n; i++){
        for(int i=index; i<=n-(k-list.size())+1; i++){// 剪枝优化
            list.add(i);
            find(n,k,i+1,list,result);
            list.remove(list.size()-1);
        }
        return;
    }
    public List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        if( n <= 0 || k<=0 || k>n) return result;
        find(n,k,1,list,result);
        return result;
    }
}
