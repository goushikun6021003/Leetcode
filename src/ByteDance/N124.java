package ByteDance;

public class N124 {
    int res;
    public int maxPathSum(TreeNode root) {

        res=Integer.MIN_VALUE;
        find(root);
        return res;
    }
    // 当前节点为根结点，到叶子节点的最大路径和
    private int find(TreeNode root){
        if(root ==null){
            return 0;
        }
        int l = Math.max(find(root.left),0);
        int r = Math.max(find(root.right),0);
        res = Math.max(res,l+r+root.val);
        return Math.max(l,r)+root.val;
    }

}
