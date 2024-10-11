#include <bits/stdc++.h>
#include <iostream>
using namespace std;

class Solution {
public:
    int maxDepth(string s) {
        int n=s.size();
        int count=0;
        int MaxCount=0;
        for (int i=0 ; i<n ; i++){
            char check=s[i];
            if (check=='('){
                count++;
                MaxCount=max(MaxCount,count);
            }
            if (check==')'){
                count--;
            }
        }
        return MaxCount;
    }
};
int main(){
    return 0;
}