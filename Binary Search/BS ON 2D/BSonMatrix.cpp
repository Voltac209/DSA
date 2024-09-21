#include <iostream>
#include <bits/stdc++.h>
using namespace std;

class Solution {
  public:
    int rowWithMax1s(vector<vector<int> > &arr) {
        // code here
        int index=-1;
        int mcount=0;
        for (int i=0 ; i<arr.size() ; i++){
            int low=0;
            int high=arr[0].size()-1;
            while (low<=high){
                int count=0;
                int mid=(low+high)/2;
                if (arr[i][mid]==1){
                    count=arr[i].size()-mid;
                    if (count>mcount){
                        mcount=count;
                        index=i;
                    }
                    high=mid-1;
                }
                else {
                    low=mid+1;
                }
            }
            
        }
        return index;
    }
};