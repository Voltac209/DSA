package DSA;

public class Sorting_1 {
    public static void main(String[] args) {
         int[] arr={1,9,11,5,2,7};
         for (int i=0 ; i<=arr.length-1; i++){
             int min=i;
             for (int j=i;j<=arr.length-1;j++){
                 if (arr[j]<arr[min]){
                     min=j;
                 }
             }
             int temp=arr[i];
             arr[i]=arr[min];
             arr[min]=temp;
         }
        for (int value:arr){
            System.out.print(" "+value);
        }
    }
}
