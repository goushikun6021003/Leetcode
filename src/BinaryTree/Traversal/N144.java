package BinaryTree.Traversal;

import javafx.util.Pair;

import java.nio.channels.Pipe;
import java.util.*;

public class N144 {
    public List<Integer> preorderTraversal(TreeNode root) {
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
                if(node.right!=null){
                    stack.push(new Pair<>(node.right,go));
                }
                if(node.left!=null){
                    stack.push(new Pair<>(node.left,go));

                }
                stack.push(new Pair<>(node,print));
            }
        }
        return res;

    }
}
