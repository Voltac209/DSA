#include <bits/stdc++.h>
using namespace std;

class Solution {
  public:
    int perfectSum(vector<int>& arr, int target) {
        // code here
        vector<vector<bool>> dp (arr.size()+1 , vector<bool> (target+1,false));
        for (int i=1 ; i<=arr.size() ; i++){
            for (int j=0 ; j<=target ; j++){
                if (arr[i-1]>j){
                    dp[i][j]=dp[i-1][j];
                }
                else{
                    dp[i][j]=dp[i-1][j] || dp[i-1][j-arr[i]];
                }
            }
        }
        int count=0;
        for (int i=1 ; i<=arr.size() ; i++){
            if (dp[i][target]) count++;
        }

        return count;
    }
};

int main(){
    return 0;
}