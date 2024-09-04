package DSA;

public class Sum4 {
    import java.util.*;
    class Solution {
        public List<List<Integer>> fourSum(int[] nums, int target) {
            List<List<Integer>> ans=new ArrayList<>();
            Arrays.sort(nums);
            int n=nums.length;
            int i=0;
            for (i=0 ; i<n ; i++){
                if (i>0 && nums[i]==nums[i-1]){
                    continue;
                }
            }
            int j=i+1;
            int k=j+1;
            int l=n-1;
            int sum=0;
            while (k<l){
                sum=nums[i]+nums[j]+nums[k]+nums[j];
                List<Integer> quad=new ArrayList<>();
                if (sum>target){
                    l--;
                }
                if (sum<target){
                    k++;
                }
                if (sum==0){
                    quad.add(nums[i]);
                    quad.add(nums[j]);
                    quad.add(nums[k]);
                    quad.add(nums[l]);
                    ans.add(quad);
                    while (k<l){
                        if (nums[k]==nums[k+1]){
                            k++;
                        }
                    }
                    while (k<l){
                        if (nums[l-1]==nums[l]){
                            l--;
                        }
                    }
                    k++;
                    l--;

                }

            }
            return ans;
        }
    }
}
