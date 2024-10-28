package DSA;
import java.util.*;
public class GenerateParentheses {
    class Solution {
        public List<String> generateParenthesis(int n) {
            List<String> list=new ArrayList<>();
            generate(list,"",0,0,n);
            return list;
        }
        public void generate(List<String> list , String curr_string , int open , int close ,int max){
            if (curr_string.length()==max*2){
                list.add(curr_string);
                return;
            }
            if (open<max) generate(list,curr_string+"(",open+1,close,max);
            if (close<open) generate(list,curr_string+")",open,close+1,max);
        }
    }
}
