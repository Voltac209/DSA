package DSA;

public class PeakElement {
    public int findPeakElement(int[] nums) {
        return split(nums);
    }
    public int split(int[] nums){
        int n=nums.length;
        int low=1;
        int high=n-2;
        int index=-1;
        if (n==1){
            return 0;
        }
        if (nums[0]>nums[1]){
            return 0;
        }
        if (nums[n-1]>nums[n-2]){
            return n-1;
        }
        while (low<=high){
            int mid=(low+high)/2;
            if (nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                return mid;
            }
            if (nums[mid-1]>=nums[mid]){
                high=mid-1;
            }
            else {
                low=mid+1;
            }

        }
        return index;
    }
}