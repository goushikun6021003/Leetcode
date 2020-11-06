package 动态规划;

import java.util.List;

public class N120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        for (int i = triangle.size()-2; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                int temp = triangle.get(i).get(j) + Math.min(triangle.get(i+1).get(j), triangle.get(i+1).get(j+1));
                triangle.get(i).set(j,temp);
            }
        }

        return triangle.get(0).get(0);
    }

}
