package 数组相关.滑动窗口;

class N3 {
    public int lengthOfLongestSubstring(String s) {
        int l=0, r=-1;
        int res=0;
        int[] frq = new int[256];
        while( l < s.length()){
            if( r+1<s.length() && frq[s.charAt(r+1)]==0){
                frq[s.charAt(++r)]=1;
            }else{
                frq[s.charAt(l++)]=0;
            }
            res=Math.max(res,r-l+1);
        }
        if(s.equals("")) return 0;
        return res;
    }
}
