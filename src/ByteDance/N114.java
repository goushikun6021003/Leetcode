package ByteDance;

public class N114 {
    public void flatten(TreeNode root) {
        if(root==null){
            return;
        }
        if(root.left!=null){
            flatten(root.left);
        }
        if(root.right!=null){
            flatten(root.right);
        }
        TreeNode temp = root.right;
        root.right=root.left;
        root.left=null;
        while(root.right!=null){
            root=root.right;
        }
        root.right=temp;
    }
}
