package ByteDance;

public class N69 {
    public int mySqrt(int x) {
        if(x==1){
            return 1;
        }
        long l=1;
        long r=x/2;
        while(l<=r){
            long mid=(l+r)/2;
            long cur=mid*mid;
            long next =(mid+1)*(mid+1);
            if(cur==x||cur<x&&x<next){
                return (int)mid;
            }else if(x>cur){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return 0;
    }
}
