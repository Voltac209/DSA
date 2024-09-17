class Solution {
public:
    int shipWithinDays(vector<int>& weights, int days) {
        //Within days
        //Everyday we choose elements less than capacity
        //Order must be maintained
        //Capacity of the ship needs to be found out
        int n=weights.size();
        if (n==1){
            return weights[0];
        }
        return capacity(weights,days);
        
    }
    int capacity(vector<int>& weights, int days){
        int n=weights.size();
        int high=0;
        for (int i=0 ; i<n ; ++i){
            high+=weights[i];
        }
        int low=*max_element(weights.begin(), weights.end());
        int ans=0;
        while (low<=high){
            int mid=(low+high)/2;
            if (time(weights,mid)<=days){
                ans=mid;
                high=mid-1;
            }
            else {
                low=mid+1;
            }

        }
        return ans;
    }
    int time(vector<int>& weights , int mid){
        int days=1;
        int n=weights.size();
        int sum=0;
        for (int i=0 ; i<n ; i++){
            if (sum+weights[i]>mid){
                sum=weights[i];
                days++;
            }
            else {
                sum+=weights[i];
            }
        }
        return days;
    }
};