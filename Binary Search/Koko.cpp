#include <iostream>
#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    int minEatingSpeed(std::vector<int>& piles, int h) {
        return search(piles, h);
    }
    
    int search(std::vector<int>& piles, int h) {
        int n = piles.size();
        int max = *std::max_element(piles.begin(), piles.end());
        int low = 1;  // The minimum eating speed cannot be zero
        int high = max;
        int ans = std::numeric_limits<int>::max();
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long long THours = 0;
            for (int i = 0; i < n; ++i) {
                THours += (piles[i] + mid - 1) / mid;  // Equivalent to ceil(piles[i] / mid)
            }
            if (THours <= h) {
                ans = mid;  // Update the answer if we find a smaller valid k
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
};