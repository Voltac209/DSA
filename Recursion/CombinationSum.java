package DSA;
import java.util.*;
public class CombinationSum
{
    class Solution {
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> res=new ArrayList<>();
            generate(candidates,target,0,res,new ArrayList<>());
            return res;
        }
        public void generate(int[] candidates,int target ,int index, List<List<Integer>> res , List<Integer> ls) {
            if (index==candidates.length){
                if (target==0) res.add(new ArrayList<>(ls));
                return;
            }
            if (candidates[index]<=target){//represents the choice of picking the index elementx
                ls.add(candidates[index]);
                generate(candidates,target-candidates[index],index,res,ls);
                ls.remove(ls.size()-1); //undoes the element picked before the recursion
            }
            generate(candidates,target,index+1,res,ls);//represents the choice of not picking the element
        }
    }
}
