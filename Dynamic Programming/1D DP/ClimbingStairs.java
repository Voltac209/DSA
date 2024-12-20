package DSA;

public class ClimbingStairs {
    class Solution {
        public int climbStairs(int n){
            int[] memo=new int[n+1];
            if (n==1) return 1;
            if (n==0) return 0;
            memo[0]=1;
            memo[1]=1;
            for (int i=2 ; i<=n ; i++){
                memo[i]=memo[i-1]+memo[i-2];
            }
            return memo[n];

        }
    }
}
