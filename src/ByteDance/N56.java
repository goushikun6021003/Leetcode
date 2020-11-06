package ByteDance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N56 {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1){
            return intervals;
        }
        Arrays.sort(intervals,(arry1,arry2)->Integer.compare(arry1[0],arry2[0]));
        List<int[]> res = new ArrayList<>();
        int[] curInterval = intervals[0];
        res.add(curInterval);
        for(int i=1;i<intervals.length; i++){
            int curStart = curInterval[0];
            int curEnd = curInterval[1];
            int nextStart = intervals[i][0];
            int nextEnd = intervals[i][1];
            if(curEnd>=nextStart){
                curInterval[1]=Math.max(curEnd,nextEnd);
            }else{
                curInterval=intervals[i];
                res.add(curInterval);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
