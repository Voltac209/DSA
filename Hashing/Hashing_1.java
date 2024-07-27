package DSA;


public class Hashing_1 {
    public static void main(String[] args) {
       int [] hash=new int[5];
        hash[0]=0;
        hash[1]=0;
        hash[2]=0;
        hash[3]=0;
        hash[4]=0;
       int [] tArray={1,1,2,3,4,};
       for (int i=0 ; i<5 ; i++){
           hash[tArray[i]]+=1;
       }
        for (int value : hash){
            System.out.print(" "+value);
        }


    }
}
