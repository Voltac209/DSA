package DSA;

public class BSRotatedArray {
    public int search(int[] nums, int target) {
        return halves(nums,target);
    }
    public int halves(int[] nums,int target){
        int n=nums.length;
        int low=0;
        int high=n-1;
        int ans=-1;
        while (low<=high){
            int mid=(low+high)/2;
            if (nums[mid]==target){
                return mid;
            }
            if (nums[low]<=nums[mid]){ //Left half is the sorted half
                if (nums[mid]>target && nums[low]<=target){
                    high=mid-1;
                }
                else {
                    low=mid+1;
                }

            }
            else {
                if (nums[mid]<target && nums[high]>=target){
                    low=mid+1;
                }
                else {
                    high=mid-1;
                }
            }
        }
        return -1;
    }
}
