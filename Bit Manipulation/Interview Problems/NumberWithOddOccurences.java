package DSA;

public class NumberWithOddOccurences {
    class Solution
    {
        public int[] twoOddNum(int Arr[], int N){
            int[] res=new int[2];
            int XORR=0;
            for (int i=0 ; i<N ;i++){
                XORR^=Arr[i];
            }
            int rightMost=(XORR&(XORR-1))^XORR;
            int b1=0;
            int b2=0;

            for (int i=0 ; i<N ;i++){
                if ((rightMost&Arr[i])==0){
                    b2^=Arr[i];
                }
                else{
                    b1^=Arr[i];
                }
            }
            if (b2>b1){
                res[0]=b2;
                res[1]=b1;
            }
            else{
                res[0]=b1;
                res[1]=b2;
            }
            return res;
        }
    }
}
