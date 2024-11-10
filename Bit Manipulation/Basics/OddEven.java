package DSA;

public class OddEven {
    class Solution {
        static String oddEven(int n) {
            // code here
            int bit=n&1;
            if (bit==1) return "odd";
            else return "even";
        }
    }
}
