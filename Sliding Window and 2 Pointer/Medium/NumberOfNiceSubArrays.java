package DSA;

public class NumberOfNiceSubArrays {
    class Solution {
        public int numberOfSubarrays(int[] nums, int k) {
            return numbers(nums,k)-numbers(nums,k-1);
        }
        public int numbers(int[] nums, int k) {
            int left=0;
            int res=0;
            int sum=0;
            for (int right=0 ; right<nums.length ; right++){
                sum+=(nums[right])%2;
                while (sum>k){
                    sum=sum-(nums[left]%2);
                    left++;
                }
                res+=(right-left+1);
            }
            return res;
        }
    }
}
