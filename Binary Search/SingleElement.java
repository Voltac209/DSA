package DSA;

public class SingleElement {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        if (n==1){
            return nums[0];
        }
        else {
            return halves(nums);
        }
    }

    //Concept
    // if (even , odd) and mid at odd check for mid-1
    // if mid at even check for mid+1
    public int halves(int[] nums){
        int n=nums.length;
        int low=1; //Done to avoid extra conditional statements
        int high=n-2;
        int result=0;
        int element=0;
        if (nums[n-1]!=nums[n-2]) {return nums[n-1];}
        if (nums[0]!=nums[1]){return nums[0];}
        while(low<=high){
            int mid=(low+high)/2;
            if (nums[mid-1]!=nums[mid] && nums[mid]!=nums[mid+1]){
                element=nums[mid];
            }
            if ((mid % 2 == 1 && nums[mid - 1] == nums[mid]) || (mid % 2 == 0 && nums[mid] == nums[mid + 1])){
                //If Condition complete for left half
                low=mid+1;
            }
            else {
                high=mid-1;
            }

        }
        return element;
    }
}
