#include <bits/stdc++.h>
#include <iostream>

class Solution {
public:
    int myAtoi(string s) {
        long long int num=0;
        int i=0 ; 
        int n=s.size();
        while (s[i]==' '){
            i++;
        }
        int digit=10;
        int j=i;
        int multiplier=1;
        while (j<n){
            if (!isdigit(s[j])){
                if (s[j]=='-' || s[j]=='+'){
                    if ((s[i]!='+' || s[i]!='-') && j-i!=0){
                        break;
                    }
                }
                else {
                    break;
                }
            }
            if (s[j]=='-'){
                multiplier=-1;
            }
            if (isdigit(s[j])){
                digit=s[j]-'0';
                num=num*10+digit;
                if (num>INT_MAX){
                    if (multiplier==1){
                        return INT_MAX;
                    }
                    else {
                        return INT_MIN;
                    }
                }
            }
            j++;

        }
        num=num*multiplier;
        if (num>INT_MAX){
            if (multiplier==1){
                return (INT_MAX)*multiplier;
            }
            else {
                return INT_MAX*multiplier;
            }
        }
        if (num < INT_MIN){
            if (multiplier==-1){
                long value=(long)INT_MIN*multiplier;
                return (int)value;
            }
            else {
                return INT_MIN*multiplier;
            }
        }
        return num;
    }
};