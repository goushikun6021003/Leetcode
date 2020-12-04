package BinaryTree;

public class N98R {
    private boolean helper(TreeNode root, Integer upper, Integer lower){
        if(root==null){
            return true;
        }
        int val = root.val;
        if(lower!=null && val<=lower) return false;
        if(upper!=null && val>=upper) return false;
        if(!helper(root.left,val,lower)) return false;
        if(!helper(root.right,upper,val)) return false;
        return true;
    }
    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }
}
