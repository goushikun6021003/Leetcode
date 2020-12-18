package BinaryTree.PathSum;

public class N404 {
    int res=0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null){
            return 0;
        }
        find(root);
        return res;
    }
    public void find(TreeNode root){
        if(root==null){
            return;
        }
        find(root.right);
        find(root.left);

        if(root.left!=null&&root.left.left==null&&root.left.right==null){
            res+=root.left.val;
        }
    }
}
