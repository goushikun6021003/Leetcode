package ByteDance;

import java.util.LinkedList;
import java.util.Queue;

public class N958 {
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList();
        q.offer(root);
        boolean flag=false;
        while(!q.isEmpty()){
            TreeNode node = q.poll();
            if(node.left!=null){
                if(flag){
                    return false;
                }else{
                    q.offer(node.left);
                }
            }else{
                flag=true;
            }
            if(node.right!=null){
                if(flag){
                    return false;
                }else{
                    q.offer(node.right);
                }
            }else{
                flag=true;
            }
        }
        return flag;
    }
}
