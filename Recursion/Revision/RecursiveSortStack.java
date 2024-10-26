package DSA;
import java.util.*;

public class RecursiveSortStack {
    class GfG {
        public Stack<Integer> sort(Stack<Integer> s) {
            // add code here.
            Stack<Integer> st=new Stack<>();
            return helper(s,st);


        }
        public Stack<Integer> helper(Stack<Integer> s,Stack<Integer> st){
            if (s.isEmpty()){
                return st;
            }
            int e1=s.pop();
            insert(st,e1);
            return helper(s,st);
        }
        public void insert(Stack<Integer> st , int e1){
            if (st.isEmpty() || e1>st.peek()){
                st.push(e1);
            }
            else {
                int top=st.pop();
                insert(st,e1);
                st.push(top);
            }
        }
    }
}
