package 递归回溯法;

import java.util.ArrayList;
import java.util.List;

public class N17 {
    String[] letterMap={
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
    };
    public void find(String digits, int index, String s, ArrayList<String> list){
        // 触发结束条件
        if(index == digits.length()){
            list.add(s);
            return;
        }
        char c = digits.charAt(index);
        assert( c >= '2' && c <='9');
        String letter = letterMap[c-'2'];

        for(int i =0; i<letter.length();i++){
            find(digits,index+1,s+letter.charAt(i),list);
        }
        return;
    }

    public List<String> letterCombinations(String digits) {
        if(digits.equals("")){
            return new ArrayList<String>();
        }
        String s = "";
        ArrayList<String> list = new ArrayList<String>();
        find(digits,0, s,list);
        return list;
    }
}
