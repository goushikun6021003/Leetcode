package BinaryTree.LevelOrder;
import java.util.*;
public class N103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean flag=true;
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node = queue.poll();
                list.add(node.val);
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
            if(flag){
                flag=false;
            }else{
                Collections.reverse(list);
                flag=true;
            }
            res.add(new ArrayList<>(list));
        }
        return res;
    }
}
