#include <iostream>
#include <bits/stdc++.h>
using namespace std;

#include <unordered_map>
#include <string>

class Solution {
public:
    int romanToInt(const std::string& s) {
        // Map to store Roman numeral values
        std::unordered_map<char, int> romanMap = {
            {'I', 1},
            {'V', 5},
            {'X', 10},
            {'L', 50},
            {'C', 100},
            {'D', 500},
            {'M', 1000}
        };

        int num = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            // Check if the current value is less than the next value
            if (i < n - 1 && romanMap[s[i]] < romanMap[s[i + 1]]) {
                num -= romanMap[s[i]]; // Subtract the current value
            } else {
                num += romanMap[s[i]]; // Add the current value
            }
        }

        return num;
    }
};
int main(){
    return 0;
}