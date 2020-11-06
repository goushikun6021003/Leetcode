package 队列;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class N347 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freMap = new HashMap();
        for(int i=0;i<nums.length;i++){
            freMap.put(nums[i],freMap.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(Comparator.comparing(e -> e.getValue()));
        for(Map.Entry<Integer,Integer> entry : freMap.entrySet()){
            minHeap.offer(entry);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        int i=0;
        int res[]=new int[k];
        while(minHeap.size()>0){
            res[i]=minHeap.poll().getValue();
            i++;
        }
        return res;
    }
}
