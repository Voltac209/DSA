package DSA;

class Solution
{
    //Function to sort the array using bubble sort algorithm.
    public static void bubbleSort(int arr[], int n)
    {
        //code here
        if (n<=0){
            return;
        }
        for (int i=1 ; i<n ; i++){
            if (arr[i-1]>arr[i]){
                int temp=arr[i-1];
                arr[i-1]=arr[i];
                arr[i]=temp;
            }
        }
        bubbleSort(arr,n-1);
    }
}
