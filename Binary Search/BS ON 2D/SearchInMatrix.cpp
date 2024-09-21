#include <iostream>
#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        bool desc=false;
        int n=matrix.size();
        for (int i=0 ; i<n ; i++){
            int low=0;
            int high=matrix[i].size()-1;
            while (low<=high){
                int mid=(low+high)/2;
                if (matrix[i][mid]==target){
                    desc=true;
                }
                if (matrix[i][mid]<target){
                    low=mid+1;
                }
                else {
                    high=mid-1;
                }
            }
        }
        return desc;
    }
};