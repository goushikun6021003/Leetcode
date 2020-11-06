package 栈;

import java.util.ArrayList;
import java.util.List;

public class N144 {
    List<Integer> list = new ArrayList<Integer>();
    /**public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if(root==null){
            return list;
        }
        int go=1;
        int print=2;
        Stack<Pair<TreeNode,Integer>> stack = new Stack<>();
        stack.push(new Pair<>(root,1));
        while(!stack.isEmpty()){
            Pair<TreeNode,Integer> pair = stack.pop();
            TreeNode node = pair.getKey();
            int state = pair.getValue();
            if(state==print){
                list.add(node.val);
            }else{
                if(node.right!=null){
                    stack.push(new Pair<>(node.right,go));
                }
                if(node.left!=null){
                    stack.push(new Pair<>(node.left,go));
                }
                stack.push(new Pair<>(node,print));
            }
        }
        return list;
    }**/
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return list;
        }

        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return list;
    }
}
