package BinaryTree.UniqueBST;

import java.util.ArrayList;
import java.util.*;

public class N95 {
    public List<TreeNode> generateTrees(int n) {
        return find(1,n);
    }
    public List<TreeNode> find(int start,int end){
        if(start>end){
            return new ArrayList<>();
        }
        if(start==end){
            return Arrays.asList(new TreeNode(start));
        }
        List<TreeNode> res = new ArrayList<>();
        for(int i=start;i<=end;i++){
            List<TreeNode> left = find(start,i-1);
            List<TreeNode> right= find(i+1,end);
            if(left.size()==0){
                for(int j=0;j<right.size();j++){
                    res.add(new TreeNode(i,null,right.get(j)));
                }
            }
            if(right.size()==0){
                for(int j=0;j<left.size();j++){
                    res.add(new TreeNode(i,left.get(j),null));

                }
            }
            for(int j=0;j<left.size();j++){
                for(int k=0;k<right.size();k++){
                    res.add(new TreeNode(i,left.get(j),right.get(k)));
                }
            }

        }
        return res;
    }

}
