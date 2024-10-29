package DSA;
import java.util.*;
public class SubsetSumsII {
    class Solution {
        public List<List<Integer>> subsetsWithDup(int[] nums) {
            List<List<Integer>> res=new ArrayList<>();
            Arrays.sort(nums);
            subsets(nums,0,res,new ArrayList<>());
            return res;
        }
        public void subsets(int[] nums,int index,List<List<Integer>> res,List<Integer> ls){
            res.add(new ArrayList<>(ls));
            for (int i=index;i<nums.length;i++){
                if (i>index && nums[i]==nums[i-1]) continue;
                ls.add(nums[i]);
                subsets(nums,i+1,res,ls);
                ls.remove(ls.size()-1);
            }
        }
    }
}
