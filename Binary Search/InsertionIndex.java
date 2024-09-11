package DSA;

public class InsertionIndex {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        //Return index not the value
        //Floor index+1
        return split(nums,target,0,n-1);
    }
    public int split(int[] nums,int target,int low,int high){
        int mid=(low+high)/2;
        int n=nums.length;
        int index=-1;
        if (low>high){
            return low;
        }
        if (nums[mid]==target){
            return mid;
        }
        if (nums[mid]<target){
            index=split(nums,target,mid+1,high);
            return (index==low) ? mid+1:index;
        }
        else {
            return split(nums,target,low,mid-1);
        }

    }
}
