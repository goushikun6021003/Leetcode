package ByteDance;

import java.util.HashMap;
import java.util.Map;

public class N105 {
    int preIndex=0;
    Map<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        TreeNode root = find(preorder,inorder,0,inorder.length-1);
        return root;
    }
    private TreeNode find(int[] preorder, int[] inorder, int left,int right){
        if(left>right){
            return null;
        }
        TreeNode root = new TreeNode(preorder[preIndex++]);
        if(root == null || left == right){
            return root;
        }
        int temp = map.get(root.val);
        root.left=find(preorder,inorder,left,temp-1);
        root.right=find(preorder,inorder,temp+1,right);
        return root;
    }
}
