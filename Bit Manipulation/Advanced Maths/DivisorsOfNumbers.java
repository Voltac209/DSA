package DSA;

public class DivisorsOfNumbers {
    class Solution {
        public static void print_divisors(int n) {
            // code here
            int rad=(int)Math.sqrt(n);

            for (int i=1 ; i<=rad ; i++){
                int div1=i;
                int div2=n/i;
                if (n%i==0){
                    System.out.print(i+" ");
                }
            }
            for (int i=rad+1 ; i<=n ;i++){
                if (n%i==0){
                    System.out.print(i+" ");
                }

            }
        }
    }
}
