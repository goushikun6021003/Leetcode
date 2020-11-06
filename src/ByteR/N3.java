package ByteR;

public class N3 {
    public int lengthOfLongestSubstring(String s){
        if(s.length()==0){
            return 0;
        }
        int[] frq =new int[256];

        int l=0;
        int r=-1;
        int res=0;
        while(l<s.length()){
            if(r+1<s.length()&&frq[s.charAt(r+1)]==0){

                frq[s.charAt(++r)]++;
            }else{
                frq[s.charAt(l++)]--;
            }
            res=Math.max(res,r-l+1);
        }
        return res;
    }

}
