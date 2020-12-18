package BinaryTree.ValidateType;

public class N100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null||q==null){
            return p==q;
        }
        return (p.val==q.val)&&isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
}
