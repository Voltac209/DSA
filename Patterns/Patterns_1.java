package DSA;

public class DSA_1 {
    public static void main(String[] args) {
        //Pattern 1
        /*
        for (int i=5;i>0;i--){
            for (int k=5-i ; k>0 ; k--){
                System.out.print(" ");
            }
            for (int j=i;j>0;j--){
                System.out.print("*");
            }
            for (int j=i-1;j>0;j--){
                System.out.print("*");
            }

            System.out.println(" ");
        }

         */
        //Pattern 2
        /*
        for (int i = 0; i < 6; i++) {
            for (int k = 5 - i; k > 0; k--)
                System.out.print(" ");
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }
        for (int i = 5; i > 0; i--) {
            for (int k = 5 - i; k > 0; k--) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            for (int j = i - 1; j > 0; j--) {
                System.out.print("*");
            }

            System.out.println(" ");

        }

         */

        //Pattern 3
        /*
        for (int i =0;i<5;i++){
            for (int j=0 ; j<i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int k=5 ; k>0 ;k--){
            for (int j=k ; j>0 ; j--){
                System.out.print("*");
            }
            System.out.println("");
        }

         */

        //Pattern 4
        /*
        for (int i=0 ; i<5 ;i++) {
            for (int k=0 ; k<i+1;k++) {


                if ((i+k) % 2 == 0) {
                    System.out.print(1);

                } else {
                    System.out.print(0);
                }
            }
            System.out.println(" ");
        }

         */
        //Pattern 5
        /*
        for (int i=1 ;  i<5 ;i++){
            for (int j=1 ; j<=i;j++){
                System.out.print(j);
            }
            for (int k=2*(5-i-1) ; k>=1 ;k-- ){
                System.out.print(" ");
            }
            for (int j=1 ; j<=i;j++){
                System.out.print(i-j+1);
            }
            System.out.println("");
        }

         */

        //Pattern 6
        /*
        int count=0;
        for (int i=0 ; i<5 ;i++){
            for (int j=0 ; j<=i ;j++){
                System.out.print((++count)+" ");
            }
            System.out.println("");
        }

         */

        //Pattern 7
        for (int i=0;i<4;i++){
            for (int l=5-i ; l>0 ; l--){
                System.out.print(" ");
            }
            for (int j=0 ; j<=i ; j++){
                char b=(char)('A'+j) ;
                System.out.print(b);
            }
            for (int p=i-1 ; p>=0 ; p--){
                char c=(char)('A'+p);
                System.out.print(c);
            }

            System.out.println("");
        }





    }
}
