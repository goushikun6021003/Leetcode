package BinaryTree.LCA;

public class N236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }
        if(p==root||q==root){
            return p==root?p:q;
        }
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if(left==null&&right==null){
            return null;
        }else if(left!=null&&right!=null){
            return root;
        }else{
            return p==null?q:p;
        }
    }
}
