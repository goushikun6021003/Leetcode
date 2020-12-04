package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class N257R {
    private void find(TreeNode root,String path,List<String> list){
        if(root == null){
            return;
        }
        if(root.right==null && root.left==null){
            list.add(path);
        }
        if(root.left!=null){
            find(root.left,path+"->"+root.left.val,list);
        }
        if(root.right!=null){
            find(root.right,path+"->"+root.right.val,list);
        }

    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if(root!=null){
            find(root,root.val+"",list);
        }
        return list;

    }
}
