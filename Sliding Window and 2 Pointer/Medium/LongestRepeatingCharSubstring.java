package DSA;

public class LongestRepeatingCharSubstring {
    class Solution {
        public int characterReplacement(String s, int k) {
            char[] temp=s.toCharArray();
            int[] freq=new int[26];
            int maxFreq=0;
            int left=0;
            int result=0;
            for (int right=0 ; right<s.length() ; right++){
                freq[temp[right]-'A']++;
                maxFreq=Math.max(maxFreq,freq[temp[right]-'A']);
                int len=right-left+1;
                if (len-maxFreq>k){
                    freq[temp[left]-'A']--;
                    left++;
                }
                result=Math.max(result,right-left+1);
            }
            return result;
        }
    }
}
