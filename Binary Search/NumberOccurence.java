package DSA;

public class hmm {
    int count(int[] arr, int n, int x) {
        // code here
        int findex=lower(arr,n,x);
        int secindex=upper(arr,n,x);
        return secindex-findex;

    }
    int lower(int[] arr,int n,int x){
        int low=0;
        int high=n-1;
        int ans=0;
        while (low<=high){
            int mid=(low+high)/2;
            if (arr[mid]>=x){
                if (arr[mid]==x){
                    ans=mid;
                }
                else {
                    ans=0;
                }
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return ans;
    }
    int upper(int[] arr,int n,int x){
        int low=0;
        int high=n-1;
        int ans=0;
        while (low<=high){
            int mid=(low+high)/2;
            if (arr[mid]<=x){
                if (arr[mid]==x){
                    ans=mid+1;
                }
                else {
                    ans=0;
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
