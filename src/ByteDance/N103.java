package ByteDance;

import java.util.*;

public class N103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root==null){
            return res;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean state= true;
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<size;i++){

                TreeNode node = q.poll();
                list.add(node.val);
                if(node.left!=null){
                    q.offer(root.left);
                }
                if(node.right!=null){
                    q.offer(root.right);
                }
            }
           if(state){
               state=false;
           }else{
               Collections.reverse(list);
               state =true;
           }
           res.add(new ArrayList<>(list));


        }
        return res;
    }
}
