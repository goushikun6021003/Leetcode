package 动态规划.House_Robber;



public class N337 {

    class Solution {
        public int rob(TreeNode root) {
            if(root==null){
                return 0;
            }
            return Math.max(find(root)[0],find(root)[1]);
        }
        private int[] find(TreeNode root){
            if(root==null){
                return new int[2];
            }
            int[] l =new int[2];
            int[] r=new int[2];
            l=find(root.left);
            r=find(root.right);
            //0代表使用当前节点，1代表不使用
            int res[]=new int[2];
            res[0]=root.val+l[1]+r[1];
            res[1]=Math.max(l[0],l[1])+Math.max(r[0],r[1]);
            return res;

        }
    }
}
