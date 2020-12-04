package 数组相关.NSum和;

import java.util.HashMap;

public class N454 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int res=0;
        for(int i=0;i<A.length;i++){
            for(int j=0;j<B.length;j++){
                map.put(A[i]+B[j],map.getOrDefault(A[i]+B[j],0)+1);
            }
        }
        for(int i=0;i<C.length;i++){
            for(int j=0;j<D.length;j++){
                if(map.containsKey(-(C[i]+D[j]))){
                    res+=map.get(-(C[i]+D[j]));
                }

            }
        }
        return res;
    }
}
