package BinaryTree;

public class N654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return build(nums,0,nums.length-1);
    }
    private TreeNode build(int[] nums,int low,int high){
        if(high<low){
            return null;
        }
        int max = Integer.MIN_VALUE;
        int index=low;
        for(int i =low;i<=high;i++){
            if(nums[i]>max){
                max=nums[i];
                index=i;
            }
        }
        TreeNode tree = new TreeNode(nums[index]);
        tree.left=build(nums,low,index-1);
        tree.right=build(nums,index+1,high);
        return tree;

    }
}
