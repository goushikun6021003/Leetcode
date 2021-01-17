package 字符匹配和前缀和;

public class N974 {
    public int subarraysDivByK(int[] A, int K) {
        if(A.length==0){
            return 0;
        }
        int map[] = new int[K];
        map[0]=1;
        int sum=0;
        int res=0;
        for(int i=0;i<A.length;i++){
            sum+=A[i];
            int key = (sum%K+K)%K;
            res+=map[key];
            map[key]++;

        }
        return res;
    }
}
