#include <iostream>
#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    string removeOuterParentheses(string s) {
        int count=0;
        int n=s.size();
        string res="";
        for (char c : s) {
            if (c == '(') {
                if (count > 0) {
                    res += c; 
                }
                count++;
            } else if (c == ')') {
                count--;
                if (count > 0) {
                    res += c; 
                }
            }
        }
        return res;
    }
};