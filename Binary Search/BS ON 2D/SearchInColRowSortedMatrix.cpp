#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main(){
    return 0;
}
class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        //Index comparing  m[i][n-i];
        int n1=matrix.size();
        int n2=matrix[0].size();
        int row=0;
        int col=n2-1;
        while (row<n1 && col>=0){
            if (matrix[row][col]==target){
                return true;
            }
            if (matrix[row][col]>target){
                col--;
            }
            else {
                row++;
            }
        }
        return false;
    }

};