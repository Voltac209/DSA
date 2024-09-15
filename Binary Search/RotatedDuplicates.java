package DSA;

public class RotatedDuplicates {
    public boolean search(int[] nums, int target) {
        return rotation(nums, target);
    }

    public boolean rotation(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (target == nums[mid]) {
                return true;
            }

            // Handle duplicates
            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++;
                high--;
            } else if (nums[low] <= nums[mid]) {
                // Left part is sorted
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1; // Search in the left part
                } else {
                    low = mid + 1; // Search in the right part
                }
            } else {
                // Right part is sorted
                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1; // Search in the right part
                } else {
                    high = mid - 1; // Search in the left part
                }
            }
        }

        return false; // Target not found
    }
}
