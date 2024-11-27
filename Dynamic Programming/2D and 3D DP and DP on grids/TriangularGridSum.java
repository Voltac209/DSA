package DSA;
import java.util.*;
public class TriangularGridSum {
    class Solution {
        public int minimumTotal(List<List<Integer>> triangle) {
            int m=triangle.size();
            int[] dp=new int[m];
            for (int i=0 ; i<triangle.get(m-1).size() ; i++){
                dp[i]=triangle.get(m-1).get(i);
            }

            for (int row=m-2 ; row>=0 ; row--){
                for (int col=0 ; col<=row ; col++){
                    dp[col]=triangle.get(row).get(col)+Math.min(dp[col],dp[col+1]);
                }
            }
            return dp[0];
        }
    }

}
