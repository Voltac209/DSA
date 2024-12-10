#include <bits/stdc++.h>
using namespace std;

class Solution {
  public:
    bool isSubsetSum(vector<int>& arr, int target) {
        // code here
        vector<vector<bool>> dp (arr.size()+1 , vector<bool>(target+1,false));
        for (int i=0 ; i<=arr.size() ; i++){
            dp[i][0]=true;
        }
        for (int i=1 ; i<=arr.size() ; i++){
            for (int j=1 ; j<=target ; j++){
                if (arr[i-1]>j){
                    dp[i][j]=dp[i-1][j];
                }
                else{
                    dp[i][j]=dp[i-1][j] || dp[i-1][j-arr[i-1]];
                }
            }
        }
        return dp[arr.size()][target];
    }
};
int main(){
    return 0;
}