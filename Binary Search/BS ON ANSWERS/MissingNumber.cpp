#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


class Solution {
public:
    int findKthPositive(vector<int>& arr, int k) {
        // range of k is same as length of n
        return find(arr,k);
    }
    int find(vector<int>& arr,int k){
        int low=0;
        int high=arr.size()-1;
        while (low<=high){
            int mid=(low+high)/2;
            int missing=arr[mid]-(mid+1);
            if (missing<k){
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return low+k;
    }
};