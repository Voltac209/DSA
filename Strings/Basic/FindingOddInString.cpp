#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main(){
    return 0;
}
class Solution {
public:
    string largestOddNumber(string num) {
        for(int i=num.size()-1;i>=0;i--){
            if((num[i]-'0')%2!=0){//num[i]-0 extracts the given digit in terms of integer
                return num.substr(0,i+1);
            }
        }
        return "";
    }
};