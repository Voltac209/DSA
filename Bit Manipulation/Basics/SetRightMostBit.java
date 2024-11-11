package DSA;

public class SetRightMostBit {
    class Solution {
        static int setBit(int n) {
            // code here
            int i = 0;
            while (((1 << i) & n) != 0) {
                i++;
            }
            return n | (1 << i);

            //n|(n+1) also give same output
        }
    }
}
