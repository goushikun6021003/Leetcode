package 数组相关.滑动窗口;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N438 {

    public List<Integer> findAnagrams(String s, String p) {
        if(p.length()>s.length()) return new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        int[] parray = new int[26];
        for(int i=0; i<p.length();i++){
            parray[p.charAt(i)-'a']++;
        }
        int[] sarray = new int[26];
        for(int i=0; i<p.length();i++){
            sarray[s.charAt(i)-'a']++;
        }

        int l=0,r=p.length()-1;

        while( r < s.length()){
            if(l>0){
                sarray[s.charAt(r)-'a']++;
                sarray[s.charAt(l-1)-'a']--;
            }
            if(Arrays.equals(parray, sarray)){
                list.add(l);// 注意顺序，先移动窗口，在判断是否相等！！！
            }
            l++;
            r++;
        }
        return list;

    }

}
