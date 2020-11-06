package 二叉树;
// 平衡二叉树
public class N110 {
    boolean res=true;
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return false;
        }
        getHeight(root);
        return res;
    }
    private int getHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        int l = getHeight(root.left);
        int r = getHeight(root.right);
        if(Math.abs(l-r)>1){
            res=false;
        }
        return Math.max(l,r)+1;
    }
}
