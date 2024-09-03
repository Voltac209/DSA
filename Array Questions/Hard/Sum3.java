
package DSA;
import java.util.*;


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        int sum=0;
        for (int i = 0; i < n - 2; i++) {
            // Skip duplicate values for 'i'
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = n - 1;
            while (j<k){
                sum=nums[i]+nums[j]+nums[k];
                List<Integer> tlist=new ArrayList<>();
                if (sum<0){

                    j++;
                }
                if (sum>0){
                    k--;
                }
                if (sum==0){
                    tlist.add(nums[i]);
                    tlist.add(nums[j]);
                    tlist.add(nums[k]);
                    list.add(tlist);
                    while (j<k && nums[j]==nums[j+1]){
                        j++;
                    }
                    while (j<k && nums[k-1]==nums[k]){
                        k--;
                    }
                    k--;
                    j++;
                }


            }
        }
        return list;
    }
}
