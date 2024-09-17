#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main(){
    return 0;
}
class Solution {
public:
    int smallestDivisor(vector<int>& nums, int threshold) {
        int n=nums.size();
        return search(nums,threshold);
    }
    int divide(vector<int>& nums,int mid){
        int n=nums.size();
        int sum=0;
        for (int i=0 ; i<n ; ++i){
            int value=(nums[i]+mid-1)/mid;
            sum+=value;
        }
        return sum;
    }
    int search(vector<int>& nums, int threshold){
        int n=nums.size();
        int low=1;
        int high=*max_element(nums.begin(),nums.end());
        int ans=0;
        while (low<=high){
            int mid=(low+high)/2;
            if (divide(nums,mid)<=threshold){
                ans=mid;
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return ans;
    }
};