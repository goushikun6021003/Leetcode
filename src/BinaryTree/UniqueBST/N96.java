package BinaryTree.UniqueBST;

public class N96 {
    public int numTrees(int n) {
        int[] res = new int[n+1];
        res[0]=res[1]=1;
        for(int i=2;i<res.length;i++){
            for(int j=0,k=i-1;j<i;j++,k--){
                res[i]+=res[j]*res[k];
            }
        }
        return res[n];
    }
}
