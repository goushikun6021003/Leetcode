package ByteDance;

public class MaxHead {
            private int[] buildMaxHeap(int[] array){
                //从最后一个节点array.length-1的父节点（array.length-1-1）/2开始，直到根节点0，反复调整堆
                for(int i=(array.length-2)/2;i>=0;i--){
                        adjustDownToUp(array, i,array.length);
                    }
                 return array;
           }

           private void adjustDownToUp(int[] array, int k, int length){
              /**  int temp =array[k];
                for(int i=2*k+1;i<length;i=2*i+1){
                    if(i<length&&array[i]<array[i+1]){
                        i++;
                    }
                    if(temp>=array[i]){
                        break;
                    }else{
                        array[k]=array[i];
                        k=i;
                    }

                }
                array[k]=temp;**/
              int left=2*k+1;
              int right=2*k+2;
              int large=k;
              if(left<length&&array[left]>array[large]) {
                  large = left;
              }

               if(right<length&&array[right]>array[large]){
                   large= right;
               }
               if(large!=k){
                   swap(array,large,k);
                   adjustDownToUp(array,large,length);
            }



           }
           private void swap(int[] nums,int l,int r){
                int temp=nums[l];
                nums[l]=nums[r];
                nums[r]=temp;
           }
}
