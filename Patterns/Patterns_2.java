package DSA;

public class DSA_2 {
    public static void main(String[] args) {
        //Pattern 1
        /*
        for (int i=4 ; i>=0 ; i--){
            for (int j =0 ; j<=4-i ;j++){
                char b=(char)('A'+(i+j));
                System.out.print(b);
            }
            System.out.println(" ");
        }

         */

        //Pattern 2
        /*

        for (int i =0;i<=5;i++){
            for (int k=5-i ; k>=0 ;k--){
                System.out.print("*");
            }
            for (int j=0 ; j<2*i ; j++){
                System.out.print(" ");
            }
            for (int k=5-i ; k>=0 ; k--){
                System.out.print("*");
            }
            System.out.println(" ");

        }
        for (int l=0 ; l<=5 ; l++){
            for (int d=0 ; d<=l ; d++){
                System.out.print("*");
            }
            for (int a=2*(5-l)-1 ; a>=0 ; a--){
                System.out.print(" ");

            }
            for (int d=0 ; d<=l ; d++){
                System.out.print("*");
            }


            System.out.println(" ");
        }

         */

        //Pattern3
        /*

        for (int i=4 ; i>0 ; i--){
            for (int b=4 ; b>=i+1 ;b--){
                System.out.print(b);
            }
            for (int j=2*i-1 ; j>0 ; j--){
                System.out.print(i);
            }
            for (int b=i+1 ; b<=4 ;b++){
                System.out.print(b);

            }
            System.out.println(" ");
        }

         */
        //Pattern4

        for (int i=0 ; i<5 ; i++){
            System.out.print("* ");
        }
        System.out.println("");
        for (int k=0 ; k<5-1 ;k++) {
            System.out.print("*");
            for (int j = 0; j < 5 +2; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println("");
        }
        for (int i=0 ; i<5 ; i++) {
            System.out.print("* ");


        }
    }
}
