#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main(){
    return 0;
}
class Solution{   
public:
    int median(vector<vector<int>> &matrix, int R, int C){
        // code here         
        int low=lowCalc(matrix,R,C);
        int high=highCalc(matrix,R,C);
        
        while (low<=high){
            int mid=(low+high)/2;
            int check=bCalc(matrix,mid,R,C);
            int cv=(R*C)/2;
            if (check<=cv){
                low=mid+1;
            }
            else {
                high=mid-1;
            }
            
        }
        return low;
    }
    int lowCalc(vector<vector<int>> &matrix , int R , int C){
        int low=2001;
        for (int i=0; i<R ; i++){
            int val=matrix[i][0];
            if (val<low){
                low=val;
            }
        }
        return low;
    }
    int highCalc(vector<vector<int>> &matrix , int R , int C){
        int high=0;
        for (int i=0 ; i<R ; i++){
            int val=matrix[i][C-1];
            if (val>high){
                high=val;
            }
        }
        return high;
    }
    int bCalc(vector<vector<int>> &matrix , int mid ,int R ,int C){
        int count=0;
        for (int i=0 ; i<R ; i++){
            auto it=upper_bound(matrix[i].begin(),matrix[i].end(),mid);
            int index=it-matrix[i].begin();
            count+=index;
        }
        return count;
    }
};