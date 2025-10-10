import java.util.*;
public class Twopower{
    public static boolean powercheak(int n){
       return ((n&(n-1))==0);
    }
    public static void main(String args[]){
    System.out.println(powercheak(16));
    }
}