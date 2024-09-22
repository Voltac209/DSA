#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main(){
    return 0;
}
class Solution {
public:
    vector<int> findPeakGrid(vector<vector<int>>& mat) {
        int n1=mat.size();
        int n2=mat[0].size();
        int low=0;
        int high=n2-1;
        while (low<=high){
            int mid=(low+high)/2;
            int RI=findRow(mat,mid);
            int left = (mid - 1 >= 0) ? mat[RI][mid - 1] : -1;
            int right = (mid + 1 < n2) ? mat[RI][mid + 1] : -1;
            if (mat[RI][mid]>left && mat[RI][mid]>right){
                return {RI,mid};
            }
            else if (left>mat[RI][mid]){
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return {-1,-1};

        
    }
    int findRow(vector<vector<int>>& mat,int mid){
        int n1=mat.size();
        int n2=mat[0].size();
        int maxVal=-1;
        int index=-1;
        for (int i=0 ; i<n1 ; i++){
            if (mat[i][mid]>maxVal){
                maxVal=mat[i][mid];
                index=i;
            }
        }
        return index;
    }
};