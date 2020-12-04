package BinaryTree.LevelOrder;
import java.util.*;
public class N102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        /**  List<List<Integer>> res = new ArrayList<>();
         Queue<Pair<TreeNode,Integer>> queue = new LinkedList<>();
         queue.add(new Pair(root,0));
         while(!queue.isEmpty()){
         TreeNode node = queue.peek().getKey();
         int level = queue.poll().getValue();
         if(level==res.size()){
         List<Integer> temp = new ArrayList<>();
         res.add(new ArrayList<>(temp));
         }
         res.get(level).add(node.val);
         if(node.left!=null){
         queue.add(new Pair(node.left,level+1));
         }
         if(node.right!=null){
         queue.add(new Pair(node.right,level+1));
         }
         }
         return res;**/
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

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

            res.add(new ArrayList<>(list));
        }
        return res;
    }
}
