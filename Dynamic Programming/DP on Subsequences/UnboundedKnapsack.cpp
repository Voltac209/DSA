#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    int knapSack(vector<int>& val, vector<int>& wt, int capacity) {
        vector<int> prev(capacity + 1, 0);

        for (int i = 0; i <= capacity; i++) {
            if (wt[0] > 0) {
                prev[i] = (i / wt[0]) * val[0];
            }
        }

        for (int i = 1; i < wt.size(); i++) {
            for (int W = 0; W <= capacity; W++) {
                int notTake = prev[W];
                int take = INT_MIN;
                if (W >= wt[i]) {
                    take = val[i] + prev[W - wt[i]];
                }
                prev[W] = max(take, notTake);
            }
        }

        return prev[capacity];
    }
};
