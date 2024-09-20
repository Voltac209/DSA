#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int shift(vector<int>& arr,int mid){
    int st=1;
    int sum=0;
    for (int i=0 ; i<arr.size() ; i++){
        if (sum+arr[i]>mid){
            sum=arr[i];
            st++;
        }
        else {
            sum+=arr[i];
        }
    }
    return st;

}
int halves(vector<int>& arr,int n,int m){
    int ans=0;
    int low=*max_element(arr.begin(),arr.end());
    int high=0;
    for (int i=0 ; i<arr.size() ; i++){
        high+=arr[i];
    }
    while (low<=high){
        int mid=(low+high)/2;
        if (shift(arr,mid)<=m){
            ans=mid;
            high=mid-1;
        }
        else {
            low=mid+1;
        }

    }
    return ans;
}
int findPages(vector<int>& arr, int n, int m) {
    // Write your code here.
    if (m>n) return -1;
    return halves(arr,n,m);
}