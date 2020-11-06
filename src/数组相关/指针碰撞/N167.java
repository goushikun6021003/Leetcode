package 数组相关.指针碰撞;
//对撞指针
public class N167 {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int[] index = new int[2];
        int r = numbers.length-1;
        while(l<r){
            if(numbers[l]+numbers[r]==target){
                index[0]=l+1;
                index[1]=r+1;
                return index;
            }else if(numbers[l]+numbers[r]<target){
                l++;
            }else if(numbers[l]+numbers[r]>target){
                r--;
            }
        }
        return index;
    }

}
