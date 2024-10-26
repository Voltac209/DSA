package DSA;

public class Pow {
    class Solution {
        public double myPow(double x, int n) {
            double res = 1;
            long exponent = n; // Use long to handle Integer.MIN_VALUE case

            if (exponent < 0) {
                x = 1 / x; // Invert the base for negative exponents
                exponent = -exponent; // Make exponent positive
            }

            while (exponent > 0) {
                if (exponent % 2 == 1) {
                    res *= x; // If exponent is odd, multiply the result by x
                }
                x *= x; // Square the base
                exponent /= 2; // Divide the exponent by 2
            }

            return res;
        }
    }

}
