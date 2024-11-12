package DSA;

public class XORRange {
    class Solution {
        public static int findXOR(int l, int r) {
            int val1=0;
            int val2=0;
            l--;

            if (l%4==1) val1=1;
            else if (l%4==2) val1=l+1;
            else if (l%4==3) val1=0;
            else val1=l;

            if (r%4==1)  val2=1;
            else if (r%4==2) val2=r+1;
            else if (r%4==3) val2=0;
            else val2=r;

            return val1^val2;
        }
    }
}
