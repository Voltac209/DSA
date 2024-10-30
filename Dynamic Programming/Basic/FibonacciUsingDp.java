package DSA;
import java.util.*;
public class FibonacciUsingDp {
    class Solution {

        static long topDown(int n) {
            // code here
            long[] dp=new long[n+1];
            for (int i=0 ; i<dp.length ; i++){
                dp[i]=-1;
            }
            return topDownHelper(n,dp);
        }
        static long topDownHelper(int n , long[] dp){
            if (n<=1) return n;
            if (dp[n]!=-1) return dp[n];
            return dp[n]=(topDownHelper(n-1,dp)+topDownHelper(n-2,dp))%(1_000_000_007);
        }

        static long bottomUp(int n) {
            // code here
            long[] dp=new long[n+1];
            if (n>=0) dp[0]=0;
            if (n>=1) dp[1]=1;
            for (int i=2 ; i<=n ; i++){
                dp[i]=(dp[i-1]+dp[i-2])%(1_000_000_007);
            }
            return dp[n];
        }

    }
}
