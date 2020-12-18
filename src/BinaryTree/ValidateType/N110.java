package BinaryTree.ValidateType;

public class N110 {
    boolean res=true;
    public boolean isBalanced(TreeNode root) {
        getHeight(root);
        return res;
    }
    public int getHeight(TreeNode root){
        if(root==null){
            return 0;
        }
        int l=getHeight(root.left);
        int r= getHeight(root.right);
        if(Math.abs(l-r)>1){
            res=false;
        }
        return Math.max(l,r)+1;
    }
}
