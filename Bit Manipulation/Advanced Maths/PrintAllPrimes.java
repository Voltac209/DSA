package DSA;

public class PrintAllPrimes {
    import java.util.ArrayList;

    class Solution
    {
        public int[] AllPrimeFactors(int N)
        {
            // Edge case for N <= 1
            if (N <= 1) return new int[0];

            ArrayList<Integer> res = new ArrayList<>();

            // Check for divisibility by 2 first
            if (N % 2 == 0) {
                res.add(2);
                while (N % 2 == 0) {
                    N /= 2;
                }
            }

            // Check for odd factors from 3 to sqrt(N)
            for (int i = 3; i * i <= N; i += 2) {
                if (N % i == 0) {
                    res.add(i);
                    while (N % i == 0) {
                        N /= i;
                    }
                }
            }

            // If N is a prime number greater than 2
            if (N > 2) {
                res.add(N);
            }

            // Convert ArrayList to int[] and return
            int[] store = new int[res.size()];
            for (int i = 0; i < res.size(); i++) {
                store[i] = res.get(i);
            }

            return store;
        }
    }

}
