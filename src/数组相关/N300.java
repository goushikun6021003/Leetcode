package 数组相关;

import java.util.*;
import java.util.HashMap;

public class N300 {
    public int[] intersect(int[] nums1, int[] nums2) {
        /**HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);

        }
        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i])){
                list.add(nums2[i]);
                map.put(nums2[i],map.get(nums2[i])-1);
                if(map.get(nums2[i])==0){
                    map.remove(nums2[i]);
                }
            }
        }
        int[] nums = new int[list.size()];
        for(int i=0;i<list.size();i++){
            nums[i]=list.get(i);
        }
        return nums;**/
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]>nums2[j]){
                j++;
            }else if(nums1[i]<nums2[j]){
                i++;
            }else if(nums1[i]==nums2[j]){
                    list.add(nums1[i]);
                    j++;
                    i++;

            }
        }
        int[] nums = new int[list.size()];
        for( i=0;i<list.size();i++){
            nums[i]=list.get(i);
        }
        return nums;
    }
}
