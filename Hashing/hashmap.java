package DSA;
import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        int [] arr={1,1,1,2,3,4,3,2,1};
        HashMap<Integer,Integer> tHash=new HashMap<>();
        for (int i=0;i<arr.length;i++){
            if (tHash.containsKey(arr[i])){
                tHash.put(arr[i],tHash.get(arr[i])+1);
            }
            else {
                tHash.put(arr[i],1);
            }
        }
        System.out.print(tHash+" ");


    }
}
