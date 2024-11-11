package DSA;

public class NumberOfSetBitsRange {
    class Solution{

        //Function to return sum of count of set bits in the integers from 1 to n.
        public static int countSetBits(int n){
            int count=0;
            int i=0;
            while (1<<(i)<=n){
                int cycleLength=1<<(i+1);//==2^(1+i)
                int fullCycle=n/cycleLength;
                int remainder=n%cycleLength;

                count+=fullCycle*(1<<i);
                if (remainder>=(1<<i)){
                    count+=remainder-(1<<i)+1;
                }
                i++;
            }
            return count;

        }
    }
}
