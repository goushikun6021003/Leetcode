package BinaryTree;
import java.util.*;
public class N652 {
    HashMap<String,Integer> map = new HashMap<>();
    List<TreeNode> res = new LinkedList<>();
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        traverse(root);
        return res;
    }
    public String traverse(TreeNode root){
        if(root==null){
            return "#";
        }
        String left = traverse(root.left);
        String right = traverse(root.right);
        String sub = left+","+right+","+root.val;
        int frq = map.getOrDefault(sub,0);
        if(frq==1){
            res.add(root);
        }
        map.put(sub,frq+1);
        return sub;
    }
}
