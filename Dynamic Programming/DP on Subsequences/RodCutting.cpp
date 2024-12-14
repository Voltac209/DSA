#include <bits/stdc++.h>
using namespace std;

int main(){
    return 0;
}
class Solution {
  public:
    int cutRod(vector<int> &price) {
        // code here
        int n=price.size();
        vector<int> prev (n+1,0);
        prev[0]=0;
        for (int cutLen=1 ; cutLen<=price.size()  ; cutLen++){
            for (int remLen=1 ; remLen<=n ; remLen++){
                int notTake=prev[remLen];
                int take=INT_MIN;
                if (remLen>=cutLen){
                    take=price[cutLen-1]+prev[remLen-cutLen];
                }
                prev[remLen]=max(notTake,take);
            }
        }
        return prev[n];
        
    }
};