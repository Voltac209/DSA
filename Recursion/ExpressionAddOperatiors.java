package DSA;
import java.util.*;

public class ExpressionAddOperatiors {
    class Solution {
        public List<String> addOperators(String num, int target) {
            List<String> res=new ArrayList<>();
            backtrack(num,target,0,res,new StringBuilder(),0,0);
            return res;
        }
        public void backtrack(String num , int target ,int index, List<String> res, StringBuilder expression , long CurrValue ,long PrevValue){
            if (index==num.length()){
                if (CurrValue==target){
                    res.add(expression.toString());
                    return;
                }
            }
            for (int i=index ; i<num.length() ; i++){
                if (num.charAt(index) == '0' && i > index) break;
                String CurrString=num.substring(index,i+1);
                long val=Long.parseLong(CurrString);
                int len=expression.length();
                if (index==0){
                    backtrack(num,target,i+1,res,expression.append(CurrString),val,val);
                    expression.setLength(len);
                }
                else {
                    backtrack(num,target,i+1,res,expression.append('+').append(CurrString),CurrValue+val,+val);
                    expression.setLength(len);
                    backtrack(num,target,i+1,res,expression.append('-').append(CurrString),CurrValue-val,-val);
                    expression.setLength(len);
                    backtrack(num,target,i+1,res,expression.append('*').append(CurrString),CurrValue-PrevValue+(val*PrevValue),val*PrevValue);
                    expression.setLength(len);
                }
            }
        }
    }
}
