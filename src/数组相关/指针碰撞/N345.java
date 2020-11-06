package 数组相关.指针碰撞;
// 善于运用toCharArray 转化字符串为字符组
public class N345 {
    public String reverseVowels(String s) {
        char[] c = s.toCharArray();
        int l=0;
        int r= c.length-1;
        char temp;
        while(l<r){
            if(!isVowel(c[l])){
                l++;
                continue;
            }
            if(!isVowel(c[r])){
                r--;
                continue;
            }
            if(isVowel(c[l])&&isVowel(c[r])){
                temp = c[r];
                c[r]=c[l];
                c[l]=temp;
                r--;
                l++;
            }

        }
        return String.valueOf(c);
    }

    static boolean isVowel(char ch){

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            return true;
        }
        return false;
    }
}
