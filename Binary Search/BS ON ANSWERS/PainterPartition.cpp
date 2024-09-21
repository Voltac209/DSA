#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main(){
    return 0;
}
int possible(vector<int> &boards, int mid) {
    //This code tells the number of painters that will be required when we cover mid units of time
    int painter=1;
    int sum=0;
    for (int i=0 ; i<boards.size() ; i++){
        if (sum+boards[i]>mid){
            sum=boards[i];
            painter++;
        }
        else {
            sum+=boards[i];
        }
    }
    return painter;
}
int area(vector<int> &boards, int k) {
    int low=*max_element(boards.begin() , boards.end());
    int high=0;
    for (int i=0 ; i<boards.size() ; i++){
        high+=boards[i];
    }
    int ans=-1;
    while (low <= high) {
        int mid=(low+high)/2;
        if (possible(boards, mid) <= k) {
            ans=mid;
            high=mid-1;
        }
        else {
            low=mid+1;
        }
    }
    return ans;
}
int findLargestMinDistance(vector<int> &boards, int k)
{
    //    Write your code here.
    //Most optimal partition hora hai using possible function wo reuired painters nikal rha hai
    return area(boards,k);
}

