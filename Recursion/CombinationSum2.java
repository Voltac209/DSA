package DSA;
import java.util.*;
public class CombinationSum2 {
    Class Solution {
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            List<List<Integer>> res=new ArrayList<>();
            Arrays.sort(candidates);
            generate(candidates,target,0,res,new ArrayList<>());
            return res;
            return res;
        }
        public void generate(int[] candidates,int target , int index,List<List<Integer>> res , List<Integer> ls){
            if (target==0){
                res.add(new ArrayList<>(ls));
                return;
            }
            if (index==candidates.length){
                return;
            }
            for (int i=index ; i<candidates.length ; i++){
                if (i>index && candidates[i]==candidates[i-1]){
                    continue;
                }
                if (candidates[i]<=target){
                    ls.add(candidates[i]);
                    generate(candidates,target-candidates[i],i+1,res,ls);
                    ls.remove(ls.size()-1);
                }
            }
        }
    }
}
