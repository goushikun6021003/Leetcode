package ByteR;


import java.util.HashMap;

public class N105 {
    HashMap<Integer,Integer> map = new HashMap<>();
    int index=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return find(preorder,inorder,0,inorder.length-1);

    }
    private TreeNode find(int[] preorder, int[] inorder,int left,int right){
        if(left>right){
            return null;
        }
        TreeNode root =new TreeNode(preorder[index++]);
        if(root==null||left==right){
            return root;
        }
        int m = map.get(root.val);
        root.left=find(preorder,inorder,left,m-1);
        root.right=find(preorder,inorder,m+1,right);
        return root;
    }
}
