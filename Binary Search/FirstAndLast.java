package DSA;

public class FirstAndLast {
    //While Loop Reduces Search Range hence making it O(logN)
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int[] result=new int[2];
        result[0]=lower(nums,target);
        result[1]=upper(nums,target);
        return result;
    }
    public int lower(int[] nums,int target){
        int n=nums.length;
        int low=0;
        int high=n-1;
        int ans=-1;
        if (low>high){
            return -1;
        }
        while (low<=high){
            int mid=(low+high)/2;
            if (nums[mid]>=target){
                high=mid-1;
                if (nums[mid]==target){
                    ans=mid;
                }
                else {
                    ans=-1;
                }
            }
            else {
                low=mid+1;
            }
        }
        return ans;
    }
    public int upper(int[] nums,int target){
        int n=nums.length;
        int low=0;
        int high=n-1;
        int ans=-1;
        if (low>high){
            return -1;
        }
        while (low<=high){
            int mid=(low+high)/2;
            if (nums[mid]<=target){
                if (nums[mid]==target){
                    ans=mid;
                }
                else {
                    ans=-1;
                }
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return ans;
    }
}
