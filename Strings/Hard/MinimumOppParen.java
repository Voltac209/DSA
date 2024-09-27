package DSA;

public class MinimumOppParen {
    class Solution {
        public int minAddToMakeValid(String s) {
            int c1=0;
            int c2=0;
            for (int i=0 ; i<s.length() ; i++){
                if (s.charAt(i)=='('){
                    c2++;
                }
                else {
                    c2--;
                }
                if (c2<0){
                    c1++;
                    c2=0;
                }
            }
            return c2+c1;
        }
    }

}
