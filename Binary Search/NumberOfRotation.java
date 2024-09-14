package DSA;

import java.util.*;
public class NumberOfRotation {
    public int findKRotation(List<Integer> arr) {
        return min(arr);
    }
    public int min(List<Integer> arr){
        int n=arr.size();
        int low=0;
        int high=n-1;
        int ans=Integer.MAX_VALUE;
        int index=-1;
        while (low<=high){
            int mid=(low+high)/2;
            if (arr.get(mid)>arr.get(high)){
                if (arr.get(mid)<ans){
                    ans=arr.get(mid);
                    index=mid;
                }
                low=mid+1;
            }
            else {
                if (arr.get(mid)<ans){
                    ans=arr.get(mid);
                    index=mid;
                }
                high=mid-1;
            }

        }
        return index;
    }
}
