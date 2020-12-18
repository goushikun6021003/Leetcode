package BinaryTree.PathSum;

import java.util.ArrayList;
import java.util.List;

public class N113 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if(root==null){
            return new ArrayList<>();
        }
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        find(root,sum,list,res);
        return res;

    }
    public void find(TreeNode root,int sum,List<Integer> list,List<List<Integer>> res){
        if(root==null){
            return;
        }
        if(root.left==null&&root.right==null&&sum==root.val){
            list.add(root.val);
            res.add(new ArrayList(list));
            list.remove(list.size()-1);
        }
        list.add(root.val);
        find(root.left,sum-root.val,list,res);
        find(root.right,sum-root.val,list,res);
        list.remove(list.size()-1);
    }
}
