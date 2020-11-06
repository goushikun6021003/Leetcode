package ByteDance;

public class N543 {
    int res;
    public int diameterOfBinaryTree(TreeNode root) {
        find(root);
        return res;
    }
    private int find(TreeNode root){
        if(root==null){
            return 0;
        }
        int l=find(root.left);
        int r=find(root.right);
        res=Math.max(res,l+r);
        return Math.max(l,r)+1;
    }
}
