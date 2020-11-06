package 动态规划.Package01;

public class N377 {

   /** int memo[];
    private int find(int[] nums, int target){
        //将sum求和转化为 target-nums[index]，所以最后为0时结束
        int res=0;
        if(target==0){
            return 1;
        }
        if(memo[target]!=-1){
            return memo[target];
        }
        for(int i = 0; i<nums.length; i++){
            if(nums[i]>target){
                break;
            }
            res+=find(nums,target-nums[i]);// 转化sum的思想！！！

        }
        memo[target]=res;
        return memo[target];
    }

    public int combinationSum4(int[] nums, int target) {
        memo = new int[target+1];
        Arrays.sort(nums);// 有重复元素以及求和考虑先排序！！！
        Arrays.fill(memo,-1);
        return  find(nums,target);
    }
    **/
   // 注意和518区别，内外循环调转，因为允许有重复排列，也就是有顺序，所以以target为基调进行循环
   // 但518无重复排列，即无顺序，所以以nums为基调循环，518就是去重后的377.
    public int combinationSum4(int[] nums, int target) {
        int memo[]=new int[target+1];


       for(int j=1;j<=target;j++){
           memo[0]=1;
           for(int i=0;i<nums.length;i++){
               if(j>=nums[i]){
                   memo[j]+=memo[j-nums[i]];
               }
           }
       }

        return memo[target];
    }
}
