#include <bits/stdc++.h>
using namespace std;

class Solution {
  public:
    int countPartitions(vector<int>& arr, int d) {
        int tSum=0;
        for (auto &it : arr) tSum+=it;
        
        if (tSum<d || (tSum+d)%2!=0) return 0;
        
        int check=(tSum+d)/2;
        vector<int> dp (check+1,0);
        dp[0]=1;
        
        for (int num : arr){
            for (int j=check ; j>=num ; j--){
                dp[j]+=dp[j-num];
            }
        }
        return dp[check];
    }
};
int main(){
    return 0;
}