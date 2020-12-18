package BinaryTree.ValidateType;

public class N222 {
    // 通用方法
    /**public int countNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        return 1+countNodes(root.left)+countNodes(root.right);
    }
    **/
    public int countNodes(TreeNode root) {

    }
    public int getHeight(TreeNode root){
        if(root==null){
            return 0;
        }
        return getHeight(root.left)+1;
    }
}
