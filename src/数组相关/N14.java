package 数组相关;

public class N14 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        String res = strs[0];
        for(int i=1; i <strs.length;i++){
            String str = strs[i];
            int j;
            for( j=0;j<str.length()&&j<res.length();j++){
                if(str.charAt(j)!=res.charAt(j)){
                  //  res = res.substring(0,j);不可以在这里更新res，因为j大于字符长度后，循环进不来，则没有更新，所以更新要在循环外面
                    break;
                }
            }
            res = res.substring(0,j);
            if(res==""){
                break;
            }

        }
        return res;
    }
}
