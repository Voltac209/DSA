package DSA;


public class Insertion {
    public static void main(String[] args) {
        int [] arr={7,4,11,8,2,9};
        int n=arr.length;
        for (int i=1 ; i<n ; i++){
            int j=i;
            while (j>0 && arr[j-1]>arr[j]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        for (int value :arr){
            System.out.print(value+" ");
        }
    }
}
