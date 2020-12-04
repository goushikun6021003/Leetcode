package BinaryTree;


import javafx.util.Pair;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 完全二叉树创建 {

    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=10;i++){
            list.add(i);
        }
        TreeNode root = new TreeNode();
        root = createTree(list);
        List<List<Integer>> ll = levelOrder(root);
        System.out.println(ll);
    }

    //根据根节点创建完全二叉树
    public static TreeNode createTree( List<Integer> list) {
        int count = 0;
        LinkedList<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(list.get(count++));
        queue.add(root);

        while (!queue.isEmpty()&&count<list.size()) {
            TreeNode lastNode = queue.poll();

            if (count < list.size()) {

                TreeNode left = new TreeNode(list.get(count++));
                lastNode.left = left;
                queue.add(left);
            }
            if (count < list.size()) {

                TreeNode right = new TreeNode(list.get(count++));
                lastNode.right = right;
                queue.add(right);
            }
        }
        return root;
    }
    public static List<List<Integer>> levelOrder(TreeNode root) {

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
