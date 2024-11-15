package DSA;
import java.util.*;

public class LongestSubstringWithoutRC {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            int right=0;
            int left=0;
            int len=0;
            HashMap<Character,Integer> store=new HashMap<>();
            while(right<s.length()){
                if (store.containsKey(s.charAt(right)) && store.get(s.charAt(right))>=left){
                    left=store.get(s.charAt(right))+1;
                }
                store.put(s.charAt(right),right);
                len=Math.max(len,right-left+1);
                right++;
            }
            return len;
        }
    }
}
