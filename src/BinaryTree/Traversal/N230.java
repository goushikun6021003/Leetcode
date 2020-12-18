package BinaryTree.Traversal;

import java.util.*;

public class N230 {

    int count=0;
    int res=0;
    public int kthSmallest(TreeNode root, int k) {

        traverse(root,k);
        return res;
    }
    public void traverse(TreeNode root,int k){
        if(root==null){
            return;
        }
        traverse(root.left,k);
        count++;

        if(count==k){
            res=root.val;
            return;
        }
        traverse(root.right,k);
    }

}
