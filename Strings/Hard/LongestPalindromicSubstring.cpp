#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    string longestPalindrome(string s) {
        string res="";
        if (s.length()==1){
            return s;
        }
        for (int i =0 ; i<s.size() ; i++){
            string odd=CentreSearch(s,i,i);
            if (odd.size()>res.size()){
                res=odd;
            }
            string even=CentreSearch(s,i,i+1);
            if (even.size() > res.size()){
                res=even;
            }
        }
        return res;
        
    }
    string CentreSearch(string s , int i , int j){
        int left=i;
        int right=j;
        while (left>=0 && right<s.size() && s[left]==s[right]){
            left--;
            right++;
        }
        return s.substr(left+1,right-left-1);
    }

};
int main(){
    return 0;
}