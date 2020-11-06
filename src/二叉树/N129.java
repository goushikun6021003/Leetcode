package 二叉树;

public class N129 {
    // 数据累加类思想转化，设置一个sum值，每次循环sum×10+当前值
    public int sumNumbers(TreeNode root) {

        return find(root,0);

    }
    public int find(二叉树.TreeNode root, int sum){
        if(root == null){
            return 0;
        }
        if(root.left==null && root.right==null){

            return sum*10+root.val;
        }

        return find(root.left,sum*10+root.val)+find(root.right,sum*10+root.val);


    }
}
