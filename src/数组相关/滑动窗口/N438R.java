package 数组相关.滑动窗口;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N438R {
    public List<Integer> findAnagrams(String s, String p) {
        int l=0, r=p.length()-1;
        int[] sArray = new int[256];
        int[] pArray = new int[256];
        if(s.length()<p.length()){
            return new ArrayList<Integer>();
        }
        for(int i=0;i<p.length();i++){
            sArray[s.charAt(i)]++;
        }
        for(int i=0;i<p.length();i++){
            pArray[p.charAt(i)]++;
        }
        List<Integer> result = new ArrayList<>();

        while(r<s.length()){
            if(l>0){
                sArray[s.charAt(r)]++;
                sArray[s.charAt(l-1)]--;
            }
            if(Arrays.equals(sArray,pArray)){
                result.add(l);
            }

            l++;
            r++;
        }
        return result;
    }

}
