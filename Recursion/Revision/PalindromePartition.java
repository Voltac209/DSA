package DSA;
import java.util.*;
public class PalindromePartition {
    class Solution {
        public List<List<String>> partition(String s) {
            List<List<String>> res=new ArrayList<>();
            backtrack(s,res,new ArrayList<>(),0);
            return res;
        }
        private void backtrack(String s , List<List<String>> res , List<String> ls , int index){
            if (index==s.length()){
                res.add(new ArrayList<>(ls));
                return ;
            }
            for (int i=index+1 ; i<=s.length() ; i++){
                String curr=s.substring(index,i);
                if (checkPalindrome(curr)){
                    ls.add(curr);
                    backtrack(s,res,ls,i);
                    ls.remove(ls.size()-1);
                }
            }
        }
        private boolean checkPalindrome(String s){
            int n=s.length();
            int i=0;
            int j=n-1;
            while (i<=j){
                if (s.charAt(i)!=s.charAt(j)){
                    return false;
                }
                i++;
                j--;
            }
            return true;
        }
    }
}
