package DSA;

public class BinarySubArraysWithSum {
    class Solution {
        public static int numSubarraysLessEqualSum(int[] nums, int goal)
        {
            int right=0;
            int sum=0;
            int left=0;
            int count=0;
            if(goal<0)
            {
                return 0;
            }
            while(right<nums.length)
            {
                sum=sum+nums[right];
                while(sum>goal)
                {
                    sum=sum-nums[left];
                    left++;
                }
                count=count+(right-left+1);
                right++;
            }
            return count;
        }
        public int numSubarraysWithSum(int[] nums, int goal) {
            int count=numSubarraysLessEqualSum(nums,goal)-numSubarraysLessEqualSum(nums,goal-1);
            return count;

        }
    }
}
