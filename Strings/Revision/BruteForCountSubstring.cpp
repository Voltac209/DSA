#include <bits/stdc++.h>
using namespace std;

class Solution
{
public:
    long long int substrCount(string s, int k) {
        long long int count = 0;
        int n = s.size();

        for (int start = 0; start < n; ++start) {
            std::unordered_set<char> distinctChars;

            for (int end = start; end < n; ++end) {
                distinctChars.insert(s[end]);
                
                if (distinctChars.size() == k) {
                    count++;
                }
            }
        }

        return count;
    }
};
int main(){
    return 0;
}
