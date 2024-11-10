package DSA;

public class SetGetClearBit {
    class Solution {
        static void bitManipulation(int num, int i) {
            int bit=num & (1<<i-1);
            int clear=num-bit;
            if (bit!=0){
                bit=1;
            }
            else{
                bit=0;
            }
            int set=num|(1<<i-1);
            System.out.print(bit+" ");
            System.out.print(set+" ");
            System.out.print(clear);

        }

    }
}
