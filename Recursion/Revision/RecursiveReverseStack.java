package DSA;
import java.util.*;

public class RecursiveReverseStack {
    class Solution
    {
        static void reverse(Stack<Integer> s)
        {
            // add your code here
            helper(s);

        }
        static void helper(Stack<Integer> s){
            if (s.isEmpty()){
                return ;
            }
            int top=s.pop();
            helper(s);
            downwards(s,top);
        }
        static void downwards(Stack<Integer> s , int ele){
            if (s.isEmpty()){
                s.push(ele);
                return;
            }
            int temp=s.pop();
            downwards(s,ele);
            s.push(temp);

        }
    }
}
