package DSA;

public class SubstringsWithThreeCharas {
    class Solution {
        public int numberOfSubstrings(String s) {
            int res=0;
            char[] freq=s.toCharArray();
            int[] hash={-1,-1,-1};
            for (int right=0 ; right<freq.length ; right++){
                hash[freq[right]-'a']=right;
                boolean desc=hash[0]!=-1 && hash[1]!=-1 && hash[2]!=-1;
                if (desc){
                    res+=1+findMin(hash);
                }

            }
            return res;
        }
        public int findMin(int[] hash){
            int val=Integer.MAX_VALUE;
            for (int nums : hash){
                if (nums<val){
                    val=nums;
                }
            }
            return val;
        }
    }
}
