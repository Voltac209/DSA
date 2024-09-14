package DSA;

public class MaximumRA {
    public int findMin(int[] nums) {
        return halves(nums);
    }
    public int halves(int[] nums){
        int n=nums.length;
        int low=0;
        int high=n-1;
        int ans=Integer.MIN_VALUE;
        while (low<=high){
            int mid=(low+high)/2;
            if (nums[mid]>nums[high]){
                if (nums[mid]>ans){
                    ans=nums[mid];

                }
                high=mid-1;

            }
            else {
                if (nums[mid]>ans){
                    ans=nums[mid];

                }
                low=mid+1;
            }
        }
        return ans;
    }
}
