package ByteDance;

import java.util.HashMap;
import java.util.Map;

public class N105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }
    private TreeNode build(int[] preorder,int preStart,int preEnd,int[] inorder,int inStart,int inEnd){
        if(preStart>preEnd){
            return null;
        }
        TreeNode root = new TreeNode(preorder[preStart]);
        int index=0;
        for(int i=inStart;i<=inEnd;i++){
            if(inorder[i]==preorder[preStart]){
                index=i;
                break;
            }
        }
        int leftSize=index-inStart;
        root.left=build(preorder,preStart+1,preStart+leftSize,inorder,inStart,index-1);
        root.right=build(preorder,preStart+leftSize+1,preEnd,inorder,index+1,inEnd);
        return root;
    }
}
