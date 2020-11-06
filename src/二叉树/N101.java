package 二叉树;

public class N101 {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root,root);
    }
    private boolean isMirror(TreeNode root1,TreeNode root2){
        if(root1==null||root2==null){
            return root1==root2;
        }
        return root1.val==root2.val && isMirror(root1.left,root2.right)&&isMirror(root1.right,root2.left);
    }
}
