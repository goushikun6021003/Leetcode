package 二叉树.PathSum;

import java.util.ArrayList;
import java.util.List;

public class N113 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        find(root,sum,list,result);
        return result;

    }
    public void find(TreeNode root, int sum, ArrayList<Integer> list, List<List<Integer>> result){
        if(root==null||(root.left==null && root.right==null && sum!=root.val)){
            return;
        }
        if(root.left==null && root.right==null && sum==root.val){
            list.add(root.val);
            result.add(new ArrayList<>(list));
            list.remove(list.size()-1);
            return;
        }
        list.add(root.val);
        find(root.left,sum-root.val,list,result);
        find(root.right,sum-root.val,list,result);
        list.remove(list.size()-1);

        return;


    }
}
