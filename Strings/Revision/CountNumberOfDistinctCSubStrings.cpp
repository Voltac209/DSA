#include <bits/stdc++.h>
using namespace std;

class Solution
{
  public:
    long long int substrCount (string s, int k) {
    	//code here.
    	return Distinct(s,k)-Distinct(s,k-1);
    }
    long long int Distinct(string s , int k){
        if (k<=0) return 0;
        long long int ans=0;
        int i=0,j=0,cnt=0;
        int FreqTable[26]={0};
        while (j<s.size()){
            FreqTable[s[j]-'a']++;
            if (FreqTable[s[j]-'a']==1) {
                cnt++;
            }
            
            while (cnt>k){
                FreqTable[s[i]-'a']--;
                if (FreqTable[s[i]-'a']==0) {
                    cnt--;
                }
                i++;
            }
            ans=ans+(j-i+1);
            j++;
            
        }
        return ans;
    }
};
int main(){
    return 0;
}