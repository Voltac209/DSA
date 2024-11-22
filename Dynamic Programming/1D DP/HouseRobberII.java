package DSA;

public class HouseRobberII {
    import java.util.Arrays;

    class Solution {
        public int rob(int[] nums) {
            if (nums.length == 0) return 0;
            if (nums.length == 1) return nums[0];

            int max1 = maxRobbery(Arrays.copyOfRange(nums, 0, nums.length - 1));
            int max2 = maxRobbery(Arrays.copyOfRange(nums, 1, nums.length));

            return Math.max(max1, max2);
        }

        public int maxRobbery(int[] houses) {
            int prev = 0, prev2 = 0;
            for (int money : houses) {
                int take = prev2 + money;
                int notTake = prev;
                int curr = Math.max(take, notTake);
                prev2 = prev;
                prev = curr;
            }
            return prev;
        }
    }

}
