package DSA;
import java.util.*;
public class WordBreak {
    class Solution {
        public boolean wordBreak(String s, List<String> wordDict) {
            HashSet<String> set=new HashSet<>(wordDict);
            return backtrack(s,set,0);
        }
        public boolean backtrack(String s , HashSet<String> wordDict , int curr){
            if (curr==s.length()){
                return true;
            }
            for (int end=curr+1 ; end<=s.length() ; end++){
                String temp=s.substring(curr,end);
                if (check(temp,wordDict)){
                    if (backtrack(s,wordDict , end)){
                        return true;
                    }
                }
            }
            return false;
        }
        public boolean check(String s , HashSet<String> wordDict){
            if (wordDict.contains(s)){
                return true;
            }
            return false;
        }
    }
}
