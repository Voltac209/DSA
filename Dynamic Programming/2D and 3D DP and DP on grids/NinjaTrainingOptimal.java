package DSA;

public class NinjaTrainingOptimal {
    class Solution {
        public int maximumPoints(int arr[][], int n) {
            // code here
            int p1=arr[0][0],p2=arr[0][1],p3=arr[0][2];
            int c1=0,c2=0,c3=0;
            for (int i=1  ; i<n ; i++){
                c1=arr[i][0]+Math.max(p2,p3);
                c2=arr[i][1]+Math.max(p1,p3);
                c3=arr[i][2]+Math.max(p1,p2);
                p1=c1;
                p2=c2;
                p3=c3;
            }
            return Math.max(p1,Math.max(p2,p3));
        }
    }
}
