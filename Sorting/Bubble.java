package DSA;

public class Bubble {
    public static void main(String[] args) {
        int [] arr={1,4,8,2,5};
        for (int i=arr.length-1 ; i>=1 ; i--){
            for (int j=1 ; j<=i ; j++){
                if (arr[j-1]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }

            }
        }
        for (int value:arr){
            System.out.print(" "+value);
        }
    }
}
