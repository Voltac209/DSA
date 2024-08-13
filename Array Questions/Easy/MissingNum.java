package DSA;

public class MissingNum {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        //Range is [0,n]
        int csum=(n*(n+1))/2;
        int sum=0;
        for (int i=0;i<n;i++){
            sum=sum+nums[i];
        }
        int value=0;
        if (sum!=csum){
            value=csum-sum;
        }
        return value;
    }
}
