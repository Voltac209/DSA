package DSA;
import java.util.*;

public class MergeSort {
    void merge(int arr[], int l, int m, int r)
    {
        // Your code here
        int [] left=Arrays.copyOfRange(arr,l,m+1);
        int [] right=Arrays.copyOfRange(arr,m+1,r+1);
        int i=0;
        int j=0;
        int k=l;


        while (i<left.length && j<right.length){
            if (left[i]<=right[j]){
                arr[k]=left[i];
                i++;
                k++;
            }
            else {
                arr[k]=right[j];
                j++;
                k++;
            }
        }
        while (i<left.length){
            arr[k]=left[i];
            i++;
            k++;
        }
        while (j<right.length){
            arr[k]=right[j];
            j++;
            k++;
        }




    }
    public void mergeSort(int arr[], int l, int r)
    {
        //code here
        if (l<r){
            int m=(l+r)/2;
            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);
            merge(arr,l,m,r);

        }
        else {
            return;
        }





    }
}
