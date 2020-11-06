package ByteDance;

public class N108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums==null||nums.length==0){
            return null;
        }
        return find(nums,0,nums.length-1);
    }
    private TreeNode find(int[] nums, int left,int right){
        if(left>right){
            return null;
        }
        int mid=(left+right)/2;
        TreeNode root = new TreeNode(mid);
        root.left=find(nums,left,mid-1);
        root.right=find(nums,mid+1,right);
        return root;
    }
}
