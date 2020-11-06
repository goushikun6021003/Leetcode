package 数组相关.滑动窗口;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N438_T {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(s.length()<p.length()){
            return list;
        }
        int l=0, r= p.length()-1;

        int[] parray = new int[26];
        for(int i = 0; i < p.length(); i++){
            parray[p.charAt(i)-'a']++;
        }
        int[] sarray = new int[26];
        for(int i = 0; i< p.length(); i++){
            sarray[s.charAt(i)-'a']++;
        }
        while(r<s.length()){



            if(l>0){
                sarray[s.charAt(r)-'a']++;
                sarray[s.charAt((l-1))-'a']--;
            }
            if(Arrays.equals(sarray,parray)){
                list.add(l);// 注意顺序，先移动窗口，在判断是否相等！！！
            }
            l++;
            r++;
        }
        return list;
    }
}
