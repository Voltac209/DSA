package DSA;

public class RotateString {
    class Solution {
        public boolean rotateString(String s, String goal) {
            if (s.length()!=goal.length()){
                return false;
            }
            String possible=s+s;
            return possible.contains(goal);
        }
    }
}
