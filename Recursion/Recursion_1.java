package DSA;


public class Recursion_1 {
    /*
        Print Name N times using Recursion
    public static void Print1(int a,int b){
        System.out.println("Raghav");
        a++;

        if (a>b){
            return;
        }
        else {
            Print1(a,b);
        }


    }
    public static void main(String[] args) {
        //When a function calls itself whenever a specific condition is met is called recursion
        int num=11;
        Print1(1,5);
    }

     */
    /* To Print 1 to N ascending
    public static void PrintN(int a,int b){
        System.out.println(a);
        a++;

        if (a>b){
            return;
        }
        else {
            PrintN(a,b);
        }


    }
    public static void main(String[] args) {
        //When a function calls itself whenever a specific condition is met is called recursion
        int num=11;
        PrintN(1,5);
    }

     */
    public static void Print1(int a,int b){
        System.out.println((b-a)+1);
        a++;

        if (a>b){
            return;
        }
        else {
            Print1(a,b);
        }


    }
    public static void main(String[] args) {
        //When a function calls itself whenever a specific condition is met is called recursion
        int num=11;
        Print1(1,5);
    }
}

