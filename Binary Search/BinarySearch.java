package DSA;

public class BinarySearch {
    public static void main(String[] args) {

    }
    public int search(int[] nums, int target) {
        //Used in sorted array
        int n=nums.length;
        return split(nums,0,n-1,target);
    }
    public int split(int[] nums,int left,int right,int target){
        int mid=(left+right)/2;
        int index=-1;
        if (left>right){
            return -1;
        }
        if (nums[mid]==target){
            return mid;
        }

        if (target>nums[mid]){
            return split(nums,mid+1,right,target);
        }
        else {
            return split(nums,left,mid-1,target);
        }
    }
}
