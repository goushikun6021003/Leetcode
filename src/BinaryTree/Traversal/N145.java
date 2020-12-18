package BinaryTree.Traversal;
import java.util.*;
import javafx.util.*;
public class N145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root==null){
            return new ArrayList<>();
        }
        Stack<Pair<TreeNode,Integer>> stack = new Stack<>();
        int print = 0;
        int go=1;
        stack.push(new Pair<>(root,go));
        while(!stack.isEmpty()){
            Pair<TreeNode,Integer> pair = stack.pop();
            TreeNode node = pair.getKey();
            int state = pair.getValue();
            if(state==print){
                res.add(node.val);
            }else if(state==go){
                stack.push(new Pair<>(node,print));
                if(node.right!=null){
                    stack.push(new Pair<>(node.right,go));
                }
                if(node.left!=null){
                    stack.push(new Pair<>(node.left,go));

                }

            }
        }
        return res;
    }
}
