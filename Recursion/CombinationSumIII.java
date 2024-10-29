package DSA;
import java.util.*;
public class CombinationSumIII {
    class Solution {
        public List<List<Integer>> combinationSum3(int k, int n) {
            int[] req={1,2,3,4,5,6,7,8,9};
            List<List<Integer>> res=new ArrayList<>();
            subsets(req,0,n,k,res,new ArrayList<>());
            return res;
        }
        public void subsets(int[] req , int index, int target,int length,List<List<Integer>> res , List<Integer> ls)
        {
            if (ls.size()==length){
                if (target==0){
                    res.add(new ArrayList<>(ls));
                    return;
                }
            }
            for (int i=index;i<req.length;i++){
                if (req[i]<=target){
                    ls.add(req[i]);
                    subsets(req,i+1,target-req[i],length,res,ls);
                    ls.remove(ls.size()-1);
                }
            }
        }
    }
}
