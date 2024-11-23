package DSA;

public class NinjaTraining {
    class Solution {
        public int maximumPoints(int arr[][], int n) {
            // code here
            int[][] memo=new int[n][4];
            for (int i = 0; i < n; i++) {
                Arrays.fill(memo[i], -1);
            }

            return calc(arr,n,n-1,3,0,memo);
        }
        public int calc(int arr[][],int n ,int day,int last,int total,int[][] memo){
            if (day<0) return 0;
            if (day==0){
                int max=0;
                for (int i=0 ; i<3 ; i++){
                    if (i!=last){
                        max=Math.max(arr[day][i],max);
                    }
                }
                return max;
            }
            if (memo[day][last]!=-1) return memo[day][last];
            int val1=0;
            for (int i=0 ; i<3 ; i++){
                if (i!=last){
                    val1=Math.max(calc(arr,n,day-1,i,total,memo)+arr[day][i],val1);
                }
            }
            return memo[day][last]=total+val1;
        }
    }
}
