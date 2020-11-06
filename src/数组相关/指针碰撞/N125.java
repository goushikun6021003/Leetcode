package 数组相关.指针碰撞;

public class N125 {
    public boolean isPalindrome(String s) {
        int l=0, r = s.length()-1;
        boolean n = true;
        while(l<r){
            if(!Character.isLetterOrDigit(s.charAt(l))){
                l++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(r))){
                r--;
                continue;
            }
            //if((s.charAt(l)+"").equalsIgnoreCase((s.charAt(r)+""))){
            if(Character.toLowerCase(s.charAt(l)) == Character.toLowerCase(s.charAt(r))){
                l++;
                r--;
            }else{
                return false;
            }

        }
        return n;
    }
}
