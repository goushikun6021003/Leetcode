package 数组相关.指针碰撞;

public class N344 {
    public void reverseString(char[] s) {
        int l=0;
        int r=s.length-1;
        while(l<r){
            char temp = s[r];
            s[r]=s[l];
            s[l]=temp;
            r--;
            l++;
        }
    }
}
