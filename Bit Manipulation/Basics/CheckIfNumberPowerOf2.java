package DSA;

public class CheckIfNumberPowerOf2 {
    class Solution {
        public boolean isPowerOfTwo(int n) {
            if (n <= 0) return false;
            return (n & (n - 1)) == 0;
        }
    }
}
