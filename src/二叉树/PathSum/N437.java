package 二叉树.PathSum;

public class N437 {
    int res=0;
    public int pathSum(TreeNode root, int sum) {
        if(root==null){
            return 0;
        }
        find(root,sum);
        pathSum(root.left,sum);
        pathSum(root.right,sum);
        return res;
    }
    public void find(TreeNode root,int sum){
        if(root==null){
            return;
        }
        if(sum==root.val){
            res++;

        }
        find(root.left,sum-root.val);
        find(root.right,sum-root.val);
    }
}
