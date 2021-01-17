package BinaryTree.ValidateType;

public class N222 {
    public int countNodes(TreeNode root) {

        /** if(root==null){
         return 0;
         }else{
         return 1+countNodes(root.left)+countNodes(root.right);
         }
         如果右子树的高度等于整棵二叉树的高度-1的话，那么左子树一定是一棵满二叉树，这个时候我们就很容易的计算出总结点数nodes=2**(h)-1 + 1 +右子树节点数（这里的+1表示root节点）。
         如果右子树的高度不等于整棵二叉树的高度-1的话，那么左子树不一定是一棵满二叉树，
         但是有一点可以确定，右子树一定是一棵满二叉树，这个时候我们就很容易的计算出总结点数nodes=2**(h-1)-1 + 1 +左子树节点数（这里的+1表示root节点）。
         根据这个思路我们只要不断循环下去直到root==None结束。
         **/
        if(root==null){
            return 0;
        }
        int l = getHeight(root.left);
        int r= getHeight(root.right);
        if(l==r){
            return (int)(Math.pow(2,l))-1+1+countNodes(root.right);
        }else{
            return (int)(Math.pow(2,r))-1+1+countNodes(root.left);
        }


    }
    public int getHeight(TreeNode root){
        if(root==null){
            return 0;
        }
        return getHeight(root.left)+1;
    }
}
