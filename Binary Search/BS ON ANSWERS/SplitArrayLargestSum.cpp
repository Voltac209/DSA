#include <iostream>
#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    int splitArray(vector<int>& nums, int k) {
        return halves(nums,k);
    }
    int halves(vector<int>& nums,int k){
        int low=*max_element(nums.begin(),nums.end());
        int high=0;
        int ans=0;
        for (int i=0 ; i<nums.size() ; i++){
            high+=nums[i];
        }
        while (low<=high){
            int mid=(low+high)/2;
            if (split(nums,mid)<=k){
                ans=mid;
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return ans;

    }
    int split(vector<int>& nums,int mid){
        int sum=0;
        int n=1;
        for (int i=0 ; i<nums.size() ; i++){
            if (sum+nums[i]>mid){
                n++;
                sum=nums[i];
            }
            else {
                sum+=nums[i];
            }
        }
        return n;
    }
};