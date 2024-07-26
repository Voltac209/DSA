package DSA;
import java.util.Arrays;

public class SwapArrayQ {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        ESwap(a,0,a.length-1);
        System.out.println(Arrays.toString(a));

    }

    public static void ESwap(int[] array, int start, int end) {
        if (start>=end){
            return;
        }
        int temp=array[start];
        array[start]=array[end];
        array [end]=temp;
        ESwap(array,start+1,end-1);

    }

}

