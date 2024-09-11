package DSA;

public class LowerBound {
    static int findFloor(long arr[], int n, long x) {
        //lower Bound Is Such that the smallest index where arr[i]>=n
        //K in arr[ ] k<=x

        return split(arr,0,n-1,x);


    }
    static int split(long arr[], int low , int high , long x){
        if (low>high){
            return -1;
        }
        int mid=(low+high)/2;
        int index=-1;
        if (arr[mid]==x){
            return mid;
        }
        if (arr[mid]<x){
            index=split(arr,mid+1,high,x);
            return (index == -1) ? mid : index;
        }
        else {
            return split(arr,low,mid-1,x);
        }
    }
}
