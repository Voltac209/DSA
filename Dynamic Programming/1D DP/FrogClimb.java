package DSA;

public class FrogClimb {
    class Solution{
        public int minimumEnergy(int arr[], int n) {
            if (n == 1) {
                return 0;
            }

            int[] memo = new int[n];

            memo[0] = 0;

            if (n > 1) {
                memo[1] = Math.abs(arr[0] - arr[1]);
            }

            for (int i = 2; i < n; i++) {
                int val1 = Math.abs(arr[i] - arr[i - 1]);
                int val2 = Math.abs(arr[i] - arr[i - 2]);
                memo[i] = Math.min(memo[i - 1] + val1, memo[i - 2] + val2);
            }

            return memo[n - 1];
        }
    }
}
