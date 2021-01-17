package 字符匹配和前缀和;

public class N28KMP {
    // F1: Brute-force
  /**  public int strStr(String haystack, String needle) {
        int length1 = haystack.length();
        int length2 = needle.length();
        if(length1<length2){
            return -1;
        }
        if(length2==0){
            return 0;
        }
        /** int j;
         for(int i=0;i<length1-length2+1;i++){
         for( j=0;j<length2;j++){
            if(haystack.charAt(i+j)!=needle.charAt(j)){
                break;
            }
         }
         if(j==length2){
            return i;
         }


         }
         return -1;

        for(int i=0,j=0;i<length1&&j<length2;i++){
            if(haystack.charAt(i)==needle.charAt(j)){
                j++;
            }else{
                i=i-j;
                j=0;
            }
            if(j==length2){
                return i-j+1;
            }
        }
        return -1;
    }**/
  // F2: KMP
  public int strStr(String haystack, String needle) {
      int l1 = haystack.length();
      int l2 = haystack.length();
      if(l1<l2){
          return -1;
      }
      if(l2==0){
          return 0;
      }
      char[] str1 = haystack.toCharArray();
      char[] str2 = needle.toCharArray();
      int[] next = next(str2,l2);
      int i=0;
      int j=0;
      while(i<l1&&j<l2){
          if(j==-1||str1[i]==str2[j]){
              i++;
              j++;
          }else{
              j=next[j];
          }
      }
      if(j==l2){
          return i-j;
      }
      return -1;
  }
  private int[] next(char[] str, int len){
      int[] next = new int[len];
      next[0]=-1;
      int i=0;
      int j= -1;
      while(i<len-1){
          if(j==-1||str[i]==str[j]){
              i++;
              j++;
              next[i]=j;
          }else{
              j=next[j];
          }
      }
      return next;
  }

}
