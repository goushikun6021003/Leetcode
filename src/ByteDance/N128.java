package ByteDance;

import java.util.HashSet;

public class N128 {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int MaxL=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int curNum=num;
                int length =1;
                while(set.contains(curNum+1)){
                    curNum++;
                    length++;
                }
                MaxL=Math.max(MaxL,length);
            }

        }
        return MaxL;
    }
}
