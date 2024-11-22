package DSA;

public class FrogClimb_KSteps {
    class Solution {
        public int minimizeCost(int k, int arr[]) {
            // code here
            int n=arr.length;
            int[] memo=new int[n];

            memo[0]=0;
            if (n==1) return 0;
            memo[1]=Math.abs(arr[1]-arr[0]);

            for (int i=2 ; i<n ; i++){
                memo[i]=Integer.MAX_VALUE;
                for (int a=1 ; a<=k ; a++){
                    if (i-a>=0){
                        int val=Math.abs(arr[i]-arr[i-a]);
                        memo[i]=Math.min(memo[i-a]+val,memo[i]);
                    }
                }
            }
            return memo[n-1];
        }
    }
}
