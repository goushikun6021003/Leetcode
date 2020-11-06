package 二叉树;

import java.util.ArrayList;
import java.util.List;

public class N257 {
   /**方法1 public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<String>();
        if(root == null){
            return res;
        }
        if(root.left==null&root.right==null){
            res.add(root.val+"");
            return res;
        }
        List<String> left = new ArrayList<String>();
        left = binaryTreePaths(root.left);
        for(int i=0; i< left.size();i++){
            res.add(root.val+"->"+left.get(i));
        }
        List<String> right = new ArrayList<String>();
        right = binaryTreePaths(root.right);
        for(int i=0; i< right.size();i++){
            res.add(root.val+"->"+right.get(i));
        }
        return res;
    }**/


    private void find(TreeNode root, String path,List<String> list) {
        if(root==null){
            return;
        }
        if (root.left == null && root.right == null)
            list.add(path);

        if (root.left != null)
            find(root.left, path + "->" + root.left.val,list);

        if (root.right != null)
            find(root.right, path + "->" + root.right.val,list);
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if (root != null)
            find(root, "" + root.val,list);
        return list;
    }
}
