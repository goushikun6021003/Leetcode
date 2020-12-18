package BinaryTree.PathSum;

public class N543 {
    int res=0;
    public int diameterOfBinaryTree(TreeNode root) {
        find(root);
        return res;
    }
    public int find(TreeNode root){
        if(root==null){
            return 0;
        }
        int l=find(root.left);
        int r=find(root.right);
        res=Math.max(l+r,res);
        return Math.max(l,r)+1;
    }
}
