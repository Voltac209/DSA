package DSA;
import java.util.*;
public class SubsetSum {
    class Solution {
        ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n) {
            // code here
            ArrayList<Integer> res=new ArrayList<>();
            generate(arr,n,0,new ArrayList<>(),res);
            return res;

        }
        void generate(ArrayList<Integer> arr, int n, int index, ArrayList<Integer> temp, ArrayList<Integer> res) {
            // Base case: if we've considered all elements
            if (index == arr.size()) {
                // Calculate the sum of the current subset
                int sum = sum(temp);
                res.add(sum); // Add the sum to the result list
                return;
            }

            // Include the current element in the subset
            temp.add(arr.get(index));
            generate(arr, n, index + 1, temp, res); // Move to the next element

            // Exclude the current element from the subset
            temp.remove(temp.size() - 1);
            generate(arr, n, index + 1, temp, res); // Move to the next element
        }
        int sum(ArrayList<Integer> arr ){
            int sum=0;
            for (int i=0 ; i<arr.size() ; i++){
                sum+=arr.get(i);
            }
            return sum;
        }
    }
}
