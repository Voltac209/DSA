#include <iostream>
#include <bits/stdc++.h>
using namespace std;

class Solution {
  public:
    long long int floorSqrt(long long int n) {
        // Your code goes here
        long long int low=0;
        long long int high=(n/2)+1;
        if (n==1 || n==0){
            return n;
        }
        while (low<=high){
            long long int mid=(low+high)/2;
            if (mid==(n/mid)){
                return mid;
            }
            if (mid>(n/mid)){
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return high;
    }
};