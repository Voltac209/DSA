package DSA;


class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
        HashMap <Integer,Integer> map=new HashMap <>();
        int sum=0;
        int len=0;
        map.put(0,-1);
        for (int i=0 ; i<n ; i++){
            sum=sum+arr[i];
            if (map.containsKey(sum)){
                int length = i - map.get(sum);
                if (length > len) {
                    len = length;
                }
            }
            else{
                map.put(sum,i);
            }

        }
        return len;
    }
}
