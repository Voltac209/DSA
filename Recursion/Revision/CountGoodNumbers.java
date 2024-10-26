package DSA;

public class CountGoodNumbers {
    class Solution {
        public int countGoodNumbers(long n) {
            long mod=1000000007;
            long eCount=(n+1)/2;
            long oCount=n/2;
            long powerOf5=modPow(5,eCount,mod);
            long powerOf4=modPow(4,oCount,mod);
            return (int)((powerOf5*powerOf4)%mod);
        }

        private long modPow(long base, long exp, long mod) {
            long result=1;
            while (exp>0){
                if (exp%2==1){
                    result=result*base;
                    result=result%mod;
                }
                base=(base*base)%mod;
                exp/=2;
            }
            return result;
        }
    }
}
