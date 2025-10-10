import java.util.*;
public class Setithbit{
    public static int setbit(int n,int i){
        int bitMack=1<<i;
        return n|bitMack;
    }
    public static int clearithbit(int n,int i){
        int bitMack=~(1<<i);
        return n & bitMack ;
    }
    public static void main(String args[]){
    //  System.out.println(setbit(10,2));
    System.out.println(clearithbit(10,1));
    }
}