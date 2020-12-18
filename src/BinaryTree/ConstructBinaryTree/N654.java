package BinaryTree.ConstructBinaryTree;



public class N654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {

        return find(nums,0,nums.length-1);
    }
    public TreeNode find(int[] nums,int start,int end){
        if(start>end){
            return null;
        }
        if(start==end){
            return new TreeNode(nums[start]);
        }
        int index=start;
        for(int i=start;i<=end;i++){
            if(nums[i]>nums[index]){
                index=i;

            }
        }
        TreeNode root = new TreeNode(nums[index]);
        root.left=find(nums,start,index-1);
        root.right=find(nums,index+1,end);
        return root;
    }
}
