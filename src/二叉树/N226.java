package 二叉树;

public class N226 {
    public TreeNode invertTree(TreeNode root) {
        if( root == null){
            return null;
        }
        invertTree(root.left);
        invertTree(root.right);
        TreeNode temp = new TreeNode();
        temp=root.left;
        root.left=root.right;
        root.right=temp;
        return root;
    }
}
