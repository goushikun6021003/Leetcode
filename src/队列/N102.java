package 队列;

import javafx.util.Pair;

import java.util.*;

public class N102 {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<Pair<TreeNode,Integer>> queue = new LinkedList<Pair<TreeNode,Integer>>();

        queue.add(new Pair<>(root,0));
        while(!queue.isEmpty()){
            TreeNode node = queue.peek().getKey();
            int level =queue.peek().getValue();
            queue.poll();
            if(level==result.size()){
                result.add(new ArrayList<>());
            }
            result.get(level).add(node.val);
            if(node.left!=null){
                queue.offer(new Pair<>(root.left,level+1));
            }
            if(node.right!=null){
                queue.offer(new Pair<>(root.right,level+1));
            }
        }
        return result;
    }
}
